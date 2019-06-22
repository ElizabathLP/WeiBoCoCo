package top.elizabath.weibococo.ui.entity;

public class NumberDisplayStrategyBean {
    /**
     * apply_scenario_flag : 3
     * display_text_min_number : 1000000
     * display_text : 100万+
     */

    private int apply_scenario_flag;
    private int display_text_min_number;
    private String display_text;

    public int getApply_scenario_flag() {
        return apply_scenario_flag;
    }

    public void setApply_scenario_flag(int apply_scenario_flag) {
        this.apply_scenario_flag = apply_scenario_flag;
    }

    public int getDisplay_text_min_number() {
        return display_text_min_number;
    }

    public void setDisplay_text_min_number(int display_text_min_number) {
        this.display_text_min_number = display_text_min_number;
    }

    public String getDisplay_text() {
        return display_text;
    }

    public void setDisplay_text(String display_text) {
        this.display_text = display_text;
    }
}
