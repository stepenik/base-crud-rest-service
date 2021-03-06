package io.github.cepr0.demo.dictionary.base.dto;

import io.github.cepr0.demo.base.dto.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class DictionaryResponse extends BaseResponse<String> {
	private String name;
	private Set<UserDto> users;
}
