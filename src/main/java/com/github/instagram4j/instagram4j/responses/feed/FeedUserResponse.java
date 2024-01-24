package com.github.instagram4j.instagram4j.responses.feed;

import java.util.List;
import com.github.instagram4j.instagram4j.models.media.timeline.TimelineMedia;
import com.github.instagram4j.instagram4j.responses.IGPaginatedResponse;
import com.github.instagram4j.instagram4j.responses.IGResponse;
import lombok.Data;

@Data
public class FeedUserResponse extends IGResponse implements IGPaginatedResponse {
    private List<TimelineMedia> items;
    private String next_min_id;
    private int num_results;

    public boolean isMore_available() {
        return next_min_id != null;
    }
}
