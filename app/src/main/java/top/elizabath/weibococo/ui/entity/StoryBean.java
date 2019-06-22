package top.elizabath.weibococo.ui.entity;

import java.util.List;

public class StoryBean {
    /**
     * bizType : 0
     * segments_ids : [4385719674710967]
     * story_id : 1042151:4385719674710967_6
     * type : 6
     */

    private int bizType;
    private String story_id;
    private int type;
    private List<Long> segments_ids;

    public int getBizType() {
        return bizType;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public String getStory_id() {
        return story_id;
    }

    public void setStory_id(String story_id) {
        this.story_id = story_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Long> getSegments_ids() {
        return segments_ids;
    }

    public void setSegments_ids(List<Long> segments_ids) {
        this.segments_ids = segments_ids;
    }
}
