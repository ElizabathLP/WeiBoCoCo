package top.elizabath.weibococo.ui.entity;

import java.util.List;

public class StoryBean {
    /**
     * bizType : 0
     * segments_ids : [4382420464518417]
     * story_id : 1042151:4382420464518417_6
     * type : 6
     */

    private String bizType;
    private String story_id;
    private String type;
    private List<Long> segments_ids;

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getStory_id() {
        return story_id;
    }

    public void setStory_id(String story_id) {
        this.story_id = story_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Long> getSegments_ids() {
        return segments_ids;
    }

    public void setSegments_ids(List<Long> segments_ids) {
        this.segments_ids = segments_ids;
    }
}
