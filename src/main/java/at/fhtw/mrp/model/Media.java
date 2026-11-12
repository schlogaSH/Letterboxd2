package at.fhtw.mrp.model;

import java.util.List;

public class Media {

    private Integer id;
    private int creatorId;
    private String title;
    private String description;
    private MediaType mediaType;
    private int releaseYear;
    private int ageRestriction;
    private List<String> genres;

    public int getCreatorId() { return creatorId;}
    public Integer getId() { return id; }
    public String getTitle() { return title; }
    public MediaType getMediaType() { return mediaType; }
    public int getAgeRestriction() { return ageRestriction; }
    public int getReleaseYear() { return releaseYear; }
    public String getDescription() { return description; }

}
