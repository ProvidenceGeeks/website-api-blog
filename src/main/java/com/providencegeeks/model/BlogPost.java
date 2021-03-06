package com.providencegeeks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Comparator;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlogPost implements Comparable<BlogPost> {

  @JsonProperty("id")
  private String id;

  @JsonProperty("date")
  private String date;

  @JsonProperty("date_gmt")
  private String date_gmt;

  @JsonProperty("guid")
  private Guid guid;

  @JsonProperty("modified")
  private String modified;

  @JsonProperty("modified_gmt")
  private String modified_gmt;

  @JsonProperty("slug")
  private String slug;

  @JsonProperty("status")
  private String status;

  @JsonProperty("type")
  private String type;

  @JsonProperty("link")
  private String link;

  @JsonProperty("title")
  private Title title;

  @JsonProperty("content")
  private Content content;

  @JsonProperty("excerpt")
  private Excerpt excerpt;

  @JsonProperty("author")
  private int author;

  @JsonProperty("featured_media")
  private int featured_media;

  @JsonProperty("comment_status")
  private String comment_status;

  @JsonProperty("ping_status")
  private String ping_status;

  @JsonProperty("sticky")
  private boolean sticky;

  @JsonProperty("template")
  private String template;

  @JsonProperty("format")
  private String format;

  @JsonProperty("author_name")
  private String author_name;

  @JsonProperty("media_details")
  private MediaDetails media_details;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDate_gmt() {
    return date_gmt;
  }

  public void setDate_gmt(String date_gmt) {
    this.date_gmt = date_gmt;
  }

  public Guid getGuid() {
    return guid;
  }

  public void setGuid(Guid guid) {
    this.guid = guid;
  }

  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public String getModified_gmt() {
    return modified_gmt;
  }

  public void setModified_gmt(String modified_gmt) {
    this.modified_gmt = modified_gmt;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Title getTitle() {
    return title;
  }

  public void setTitle(Title title) {
    this.title = title;
  }

  public Content getContent() {
    return content;
  }

  public void setContent(Content content) {
    this.content = content;
  }

  public Excerpt getExcerpt() {
    return excerpt;
  }

  public void setExcerpt(Excerpt excerpt) {
    this.excerpt = excerpt;
  }

  public int getAuthor() {
    return author;
  }

  public void setAuthor(int author) {
    this.author = author;
  }

  public int getFeatured_media() {
    return featured_media;
  }

  public void setFeatured_media(int featured_media) {
    this.featured_media = featured_media;
  }

  public String getComment_status() {
    return comment_status;
  }

  public void setComment_status(String comment_status) {
    this.comment_status = comment_status;
  }

  public String getPing_status() {
    return ping_status;
  }

  public void setPing_status(String ping_status) {
    this.ping_status = ping_status;
  }

  public boolean isSticky() {
    return sticky;
  }

  public void setSticky(boolean sticky) {
    this.sticky = sticky;
  }

  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public String getAuthor_name() { return author_name; }

  public void setAuthor_name(String author_name) {
    this.author_name = author_name;
  }

  public MediaDetails getMedia_details() {
    return media_details;
  }

  public void setMedia_details(MediaDetails media_details) {
    this.media_details = media_details;
  }

  @Override
  public int compareTo(BlogPost other) {
    SimpleDateFormat df = new SimpleDateFormat("YYYY-mm-dd'T'hh:MM:ss");
    df.setTimeZone(TimeZone.getTimeZone("UTC"));

    try {
      Date date1 = df.parse(this.getDate());
      Date date2 = df.parse(other.getDate());

      return date1.compareTo(date2);
    } catch(Exception e) {
      System.out.println(e.getMessage());
      return 0;
    }
  }

  public static Comparator<BlogPost> DateComparator = new Comparator<BlogPost>() {
    @Override
    public int compare(BlogPost post1, BlogPost post2) {
      return post2.compareTo(post1);
    }
  };
}
