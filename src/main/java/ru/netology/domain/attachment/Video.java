package ru.netology.domain.attachment;

import ru.netology.domain.LikesInfo;
import ru.netology.domain.RepostsInfo;

public class Video {
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private int duration;
    private int date;
    private int addingDate;
    private int views;
    private int localViews;
    private int comments;
    private String player;
    private String platform;
    private boolean canEdit;
    private boolean canAdd;
    private boolean isPrivate;
    private String accessKey;
    private boolean processing;
    private boolean isFavorite;
    private boolean canComment;
    private boolean canLike;
    private boolean canRepost;
    private boolean canSubscribe;
    private boolean canAddToFaves;
    private boolean canAttachLink;
    private int width;
    private int height;
    private int userId;
    private boolean converting;
    private boolean added;
    private boolean isSubscribed;
    private int repeat;
    private String type;
    private int balance;
    private String liveStatus;
    private boolean live;
    private boolean upcoming;
    private int spectators;
    private LikesInfo likes;
    private RepostsInfo reposts;
}
