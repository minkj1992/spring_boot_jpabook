package gukbap.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberListResponse<T> {
    private T data;
}
