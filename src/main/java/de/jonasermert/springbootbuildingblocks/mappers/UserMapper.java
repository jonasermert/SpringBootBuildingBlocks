package de.jonasermert.springbootbuildingblocks.mappers;

import java.util.List;

import de.jonasermert.springbootbuildingblocks.dtos.UserMsDto;
import de.jonasermert.springbootbuildingblocks.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "Spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    //User To UserMsDto
    @Mappings({
            @Mapping(source= "email", target="emailaddress"),
            @Mapping(source = "role", target="rolename")
    })
    UserMsDto userToUserMsDto(User user);

    //List<User> to List<UserMsDto>
    List<UserMsDto> usersToUserDtos(List<User> users);

}
