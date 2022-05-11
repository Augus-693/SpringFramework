package fun.augus.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5.config
 * @FileName: SpringConfig
 * @date 2022年04月26日 18:31
 * @version: 1.0
 */


@Configuration  //作为配置类，替代xml文件
@ComponentScan(basePackages = {"fun.augus"})
public class SpringConfig {

}
