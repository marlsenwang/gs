
create database gs default character set=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `users` (
                         `id` bigint PRIMARY KEY AUTO_INCREMENT,
                         `username` varchar(128) UNIQUE NOT NULL,
                         `nickname` varchar(255) UNIQUE,
                         `avatar` varchar(255),
                         `password` varchar(255) NOT NULL,
                         `fans_count` int DEFAULT 0,
                         `follow_count` int DEFAULT 0,
                         `last_login` timestamp,
                         `created_at` timestamp NOT NULL DEFAULT (current_timestamp()),
                         `created_location` varchar(255)
);

CREATE TABLE `videos` (
                          `id` bigint PRIMARY KEY AUTO_INCREMENT,
                          `user_id` bigint,
                          `video_title` varchar(1024) NOT NULL,
                          `video_type` varchar(128) NOT NULL,
                          `video_description` text NOT NULL,
                          `like_counts` int NOT NULL DEFAULT 0,
                          `status` int NOT NULL DEFAULT 0,
                          `created_at` timestamp NOT NULL DEFAULT (current_timestamp()),
                          `created_location` varchar(255)
);

CREATE TABLE `users_fans` (
                              `id` bigint PRIMARY KEY AUTO_INCREMENT,
                              `user_id` bigint NOT NULL,
                              `fan_id` bigint NOT NULL,
                              `created_at` timestamp NOT NULL DEFAULT (current_timestamp())
);

CREATE TABLE `users_like_videos` (
                                     `id` bigint PRIMARY KEY AUTO_INCREMENT,
                                     `user_id` bigint NOT NULL,
                                     `video_id` bigint NOT NULL
);

CREATE TABLE `users_report` (
                                `id` bigint PRIMARY KEY AUTO_INCREMENT,
                                `user_id` bigint NOT NULL,
                                `reported_user_id` bigint NOT NULL,
                                `video_id` bigint NOT NULL,
                                `title` varchar(255) NOT NULL,
                                `content` varchar(1000) NOT NULL,
                                `created_at` timestamp NOT NULL DEFAULT (current_timestamp())
);

CREATE TABLE `comments` (
                            `id` bigint PRIMARY KEY AUTO_INCREMENT,
                            `video_id` bigint NOT NULL,
                            `user_id` bigint NOT NULL,
                            `to_user_id` bigint,
                            `parent_comment_id` bigint DEFAULT null,
                            `comment` text NOT NULL,
                            `created_at` timestamp NOT NULL DEFAULT (current_timestamp())
);

CREATE UNIQUE INDEX `users_fans_index_0` ON `users_fans` (`user_id`, `fan_id`);

CREATE UNIQUE INDEX `users_like_videos_index_1` ON `users_like_videos` (`user_id`, `video_id`);