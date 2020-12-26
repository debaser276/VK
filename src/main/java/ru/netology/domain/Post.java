package ru.netology.domain;

import java.util.Date;

public class Post {
    private long id;
    private long ownerId;
    private long fromId;
    private long createdBy;
    private Date date;
    private String text;
    private long replyOwnerId;
    private long replyPostId;
    private boolean friendsOnly;
    private CommentsInfo comments;
    private LikesInfo likes;
    private RepostsInfo reposts;
    private ViewsInfo views;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private long signedId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private long postponedId;
}
