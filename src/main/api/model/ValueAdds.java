
package main.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "@size",
    "ValueAdd"
})
public class ValueAdds {

    @JsonProperty("@size")
    private String Size;
    @JsonProperty("ValueAdd")
    private List<main.api.model.ValueAdd> ValueAdd = new ArrayList<main.api.model.ValueAdd>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Size
     */
    @JsonProperty("@size")
    public String getSize() {
        return Size;
    }

    /**
     * 
     * @param Size
     *     The @size
     */
    @JsonProperty("@size")
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * 
     * @return
     *     The ValueAdd
     */
    @JsonProperty("ValueAdd")
    public List<main.api.model.ValueAdd> getValueAdd() {
        return ValueAdd;
    }

    /**
     * 
     * @param ValueAdd
     *     The ValueAdd
     */
    @JsonProperty("ValueAdd")
    public void setValueAdd(List<main.api.model.ValueAdd> ValueAdd) {
        this.ValueAdd = ValueAdd;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
