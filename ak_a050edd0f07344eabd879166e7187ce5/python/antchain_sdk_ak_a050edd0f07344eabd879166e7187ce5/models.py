# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import List


class Config(TeaModel):
    """
    Model for initing client
    """
    def __init__(
        self,
        access_key_id: str = None,
        access_key_secret: str = None,
        security_token: str = None,
        protocol: str = None,
        read_timeout: int = None,
        connect_timeout: int = None,
        http_proxy: str = None,
        https_proxy: str = None,
        endpoint: str = None,
        no_proxy: str = None,
        max_idle_conns: int = None,
        user_agent: str = None,
        socks_5proxy: str = None,
        socks_5net_work: str = None,
        max_idle_time_millis: int = None,
        keep_alive_duration_millis: int = None,
        max_requests: int = None,
        max_requests_per_host: int = None,
    ):
        # accesskey id
        self.access_key_id = access_key_id
        # accesskey secret
        self.access_key_secret = access_key_secret
        # security token
        self.security_token = security_token
        # http protocol
        self.protocol = protocol
        # read timeout
        self.read_timeout = read_timeout
        # connect timeout
        self.connect_timeout = connect_timeout
        # http proxy
        self.http_proxy = http_proxy
        # https proxy
        self.https_proxy = https_proxy
        # endpoint
        self.endpoint = endpoint
        # proxy white list
        self.no_proxy = no_proxy
        # max idle conns
        self.max_idle_conns = max_idle_conns
        # user agent
        self.user_agent = user_agent
        # socks5 proxy
        self.socks_5proxy = socks_5proxy
        # socks5 network
        self.socks_5net_work = socks_5net_work
        # 长链接最大空闲时长
        self.max_idle_time_millis = max_idle_time_millis
        # 长链接最大连接时长
        self.keep_alive_duration_millis = keep_alive_duration_millis
        # 最大连接数（长链接最大总数）
        self.max_requests = max_requests
        # 每个目标主机的最大连接数（分主机域名的长链接最大总数
        self.max_requests_per_host = max_requests_per_host

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_key_id is not None:
            result['accessKeyId'] = self.access_key_id
        if self.access_key_secret is not None:
            result['accessKeySecret'] = self.access_key_secret
        if self.security_token is not None:
            result['securityToken'] = self.security_token
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.read_timeout is not None:
            result['readTimeout'] = self.read_timeout
        if self.connect_timeout is not None:
            result['connectTimeout'] = self.connect_timeout
        if self.http_proxy is not None:
            result['httpProxy'] = self.http_proxy
        if self.https_proxy is not None:
            result['httpsProxy'] = self.https_proxy
        if self.endpoint is not None:
            result['endpoint'] = self.endpoint
        if self.no_proxy is not None:
            result['noProxy'] = self.no_proxy
        if self.max_idle_conns is not None:
            result['maxIdleConns'] = self.max_idle_conns
        if self.user_agent is not None:
            result['userAgent'] = self.user_agent
        if self.socks_5proxy is not None:
            result['socks5Proxy'] = self.socks_5proxy
        if self.socks_5net_work is not None:
            result['socks5NetWork'] = self.socks_5net_work
        if self.max_idle_time_millis is not None:
            result['maxIdleTimeMillis'] = self.max_idle_time_millis
        if self.keep_alive_duration_millis is not None:
            result['keepAliveDurationMillis'] = self.keep_alive_duration_millis
        if self.max_requests is not None:
            result['maxRequests'] = self.max_requests
        if self.max_requests_per_host is not None:
            result['maxRequestsPerHost'] = self.max_requests_per_host
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('accessKeyId') is not None:
            self.access_key_id = m.get('accessKeyId')
        if m.get('accessKeySecret') is not None:
            self.access_key_secret = m.get('accessKeySecret')
        if m.get('securityToken') is not None:
            self.security_token = m.get('securityToken')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('readTimeout') is not None:
            self.read_timeout = m.get('readTimeout')
        if m.get('connectTimeout') is not None:
            self.connect_timeout = m.get('connectTimeout')
        if m.get('httpProxy') is not None:
            self.http_proxy = m.get('httpProxy')
        if m.get('httpsProxy') is not None:
            self.https_proxy = m.get('httpsProxy')
        if m.get('endpoint') is not None:
            self.endpoint = m.get('endpoint')
        if m.get('noProxy') is not None:
            self.no_proxy = m.get('noProxy')
        if m.get('maxIdleConns') is not None:
            self.max_idle_conns = m.get('maxIdleConns')
        if m.get('userAgent') is not None:
            self.user_agent = m.get('userAgent')
        if m.get('socks5Proxy') is not None:
            self.socks_5proxy = m.get('socks5Proxy')
        if m.get('socks5NetWork') is not None:
            self.socks_5net_work = m.get('socks5NetWork')
        if m.get('maxIdleTimeMillis') is not None:
            self.max_idle_time_millis = m.get('maxIdleTimeMillis')
        if m.get('keepAliveDurationMillis') is not None:
            self.keep_alive_duration_millis = m.get('keepAliveDurationMillis')
        if m.get('maxRequests') is not None:
            self.max_requests = m.get('maxRequests')
        if m.get('maxRequestsPerHost') is not None:
            self.max_requests_per_host = m.get('maxRequestsPerHost')
        return self


class Output(TeaModel):
    def __init__(
        self,
        interaction_type: str = None,
        content_key: str = None,
        content: str = None,
        video_file_id: str = None,
        video_file_content_time: int = None,
        ext_info: str = None,
        variable_map: str = None,
        video_code: str = None,
        voice_code: str = None,
        content_list: List[str] = None,
    ):
        # 交互类型多媒体节点使用
        # 
        self.interaction_type = interaction_type
        # 播报内容类型
        self.content_key = content_key
        # 合成的播报内容或者是录音的文件地址
        self.content = content
        # 视频文件id
        self.video_file_id = video_file_id
        # 视频文件播放长度毫秒
        self.video_file_content_time = video_file_content_time
        # 扩展信息
        self.ext_info = ext_info
        # key为上面content中的变量value为名称
        self.variable_map = variable_map
        # 视频文件code
        self.video_code = video_code
        # 语音文件code
        self.voice_code = voice_code
        # 输出内容list
        self.content_list = content_list

    def validate(self):
        self.validate_required(self.interaction_type, 'interaction_type')
        self.validate_required(self.content_key, 'content_key')
        self.validate_required(self.content, 'content')
        self.validate_required(self.video_file_id, 'video_file_id')
        self.validate_required(self.video_file_content_time, 'video_file_content_time')
        self.validate_required(self.ext_info, 'ext_info')
        self.validate_required(self.variable_map, 'variable_map')
        self.validate_required(self.video_code, 'video_code')
        self.validate_required(self.voice_code, 'voice_code')
        self.validate_required(self.content_list, 'content_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.interaction_type is not None:
            result['interaction_type'] = self.interaction_type
        if self.content_key is not None:
            result['content_key'] = self.content_key
        if self.content is not None:
            result['content'] = self.content
        if self.video_file_id is not None:
            result['video_file_id'] = self.video_file_id
        if self.video_file_content_time is not None:
            result['video_file_content_time'] = self.video_file_content_time
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.variable_map is not None:
            result['variable_map'] = self.variable_map
        if self.video_code is not None:
            result['video_code'] = self.video_code
        if self.voice_code is not None:
            result['voice_code'] = self.voice_code
        if self.content_list is not None:
            result['content_list'] = self.content_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('interaction_type') is not None:
            self.interaction_type = m.get('interaction_type')
        if m.get('content_key') is not None:
            self.content_key = m.get('content_key')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('video_file_id') is not None:
            self.video_file_id = m.get('video_file_id')
        if m.get('video_file_content_time') is not None:
            self.video_file_content_time = m.get('video_file_content_time')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('variable_map') is not None:
            self.variable_map = m.get('variable_map')
        if m.get('video_code') is not None:
            self.video_code = m.get('video_code')
        if m.get('voice_code') is not None:
            self.voice_code = m.get('voice_code')
        if m.get('content_list') is not None:
            self.content_list = m.get('content_list')
        return self


class Input(TeaModel):
    def __init__(
        self,
        fe_id: str = None,
        id: int = None,
        code: str = None,
        name: str = None,
        value: List[str] = None,
        type: str = None,
        custom: bool = None,
        multiple: bool = None,
    ):
        # 参数唯一id
        self.fe_id = fe_id
        # 因子的id
        self.id = id
        # 参数的code
        self.code = code
        # 参数的名称
        self.name = name
        # 参数取值
        self.value = value
        # 参数的值类型
        self.type = type
        # 是否使用自定义值
        self.custom = custom
        # 是否多选
        self.multiple = multiple

    def validate(self):
        self.validate_required(self.fe_id, 'fe_id')
        self.validate_required(self.id, 'id')
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.value, 'value')
        self.validate_required(self.type, 'type')
        self.validate_required(self.custom, 'custom')
        self.validate_required(self.multiple, 'multiple')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.fe_id is not None:
            result['fe_id'] = self.fe_id
        if self.id is not None:
            result['id'] = self.id
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.value is not None:
            result['value'] = self.value
        if self.type is not None:
            result['type'] = self.type
        if self.custom is not None:
            result['custom'] = self.custom
        if self.multiple is not None:
            result['multiple'] = self.multiple
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fe_id') is not None:
            self.fe_id = m.get('fe_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('custom') is not None:
            self.custom = m.get('custom')
        if m.get('multiple') is not None:
            self.multiple = m.get('multiple')
        return self


class OutputGroup(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        condition_type: str = None,
        condition_config: List[str] = None,
        content_list: List[Output] = None,
        priority: int = None,
    ):
        # 子节点id
        self.id = id
        # 自节点名称
        self.name = name
        # 快捷条件选择类型
        self.condition_type = condition_type
        # 条件表达式
        self.condition_config = condition_config
        # 子节点下的播报内容
        self.content_list = content_list
        # 重试播报时的优先级
        self.priority = priority

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.condition_type, 'condition_type')
        self.validate_required(self.condition_config, 'condition_config')
        self.validate_required(self.content_list, 'content_list')
        if self.content_list:
            for k in self.content_list:
                if k:
                    k.validate()
        self.validate_required(self.priority, 'priority')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.condition_type is not None:
            result['condition_type'] = self.condition_type
        if self.condition_config is not None:
            result['condition_config'] = self.condition_config
        result['content_list'] = []
        if self.content_list is not None:
            for k in self.content_list:
                result['content_list'].append(k.to_map() if k else None)
        if self.priority is not None:
            result['priority'] = self.priority
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('condition_type') is not None:
            self.condition_type = m.get('condition_type')
        if m.get('condition_config') is not None:
            self.condition_config = m.get('condition_config')
        self.content_list = []
        if m.get('content_list') is not None:
            for k in m.get('content_list'):
                temp_model = Output()
                self.content_list.append(temp_model.from_map(k))
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        return self


class NodeInfo(TeaModel):
    def __init__(
        self,
        biz_tag: Output = None,
        sub_type: str = None,
        transfer_target_type: str = None,
        transfer_data: str = None,
        skill_group_no: str = None,
        ext_info: str = None,
        biz_achieve: bool = None,
        voice_type: str = None,
        model_type: str = None,
        model_id: str = None,
        llm_labels: List[str] = None,
        required: bool = None,
        repeat_time: int = None,
        interruptable: bool = None,
        sts: str = None,
        appkey: str = None,
        post_interaction_component: bool = None,
        corpus_choose_strategy: str = None,
        corpus_choose_model_url: str = None,
        corpus_choose_model_type: str = None,
        global_intention: bool = None,
        global_intention_reply: Output = None,
        button_type: str = None,
        button_digit: int = None,
        button_terminator: str = None,
        button_timeout: int = None,
        button_validator: str = None,
        static_keys: List[str] = None,
        static_key_previous: bool = None,
        static_key_repeat: bool = None,
        static_key_skip_input_check: bool = None,
        round: bool = None,
        language: str = None,
        ie_instance_code: str = None,
        sub_flow_fe_id: str = None,
        sub_flow_dynamic_id: str = None,
        sub_flow_input: List[Input] = None,
        start_params: List[Input] = None,
        allow_interaction_types: List[str] = None,
        share_factors: List[Input] = None,
    ):
        # 业务标签
        self.biz_tag = biz_tag
        # 节点子类型
        self.sub_type = sub_type
        # 人工类型
        self.transfer_target_type = transfer_target_type
        # 路由点
        self.transfer_data = transfer_data
        # 技能组
        self.skill_group_no = skill_group_no
        # 扩展信息
        self.ext_info = ext_info
        # 业务达成
        self.biz_achieve = biz_achieve
        # 音色
        self.voice_type = voice_type
        # 模型类型
        self.model_type = model_type
        # 分类模型id
        self.model_id = model_id
        # llm意图识别列表配置
        self.llm_labels = llm_labels
        # 是否必填
        self.required = required
        # 失败后重复次数
        self.repeat_time = repeat_time
        # 是否允许重试话术打断
        self.interruptable = interruptable
        # sts配置
        self.sts = sts
        # appkey
        self.appkey = appkey
        # 交互组件后置
        self.post_interaction_component = post_interaction_component
        # 话术选择策略
        self.corpus_choose_strategy = corpus_choose_strategy
        # 话术选择策略模型的地址
        self.corpus_choose_model_url = corpus_choose_model_url
        # 话术选择策略模型类型
        self.corpus_choose_model_type = corpus_choose_model_type
        # 全局意图
        self.global_intention = global_intention
        # 命中全局意图后需要播报的内容
        self.global_intention_reply = global_intention_reply
        # 按键类型
        self.button_type = button_type
        # 按键位数
        self.button_digit = button_digit
        # 结束按键
        self.button_terminator = button_terminator
        # 收号超时时间
        self.button_timeout = button_timeout
        # 收号校验规则
        self.button_validator = button_validator
        # 静态菜单配置
        self.static_keys = static_keys
        # 是否支持按键返回上一级
        self.static_key_previous = static_key_previous
        # 是否支持按键重播
        self.static_key_repeat = static_key_repeat
        # 是否跳过用户输入的错误校验
        self.static_key_skip_input_check = static_key_skip_input_check
        # 只有客权的静态菜单开发
        self.round = round
        # 静态菜单语言
        self.language = language
        # 实例码
        self.ie_instance_code = ie_instance_code
        # 子流程ID
        self.sub_flow_fe_id = sub_flow_fe_id
        # 动态子流程id值
        self.sub_flow_dynamic_id = sub_flow_dynamic_id
        # 输入参数配置
        self.sub_flow_input = sub_flow_input
        # 开始节点参数
        self.start_params = start_params
        # 和ouput中的interactionType保持一致
        self.allow_interaction_types = allow_interaction_types
        # 需要共享上下文的虚拟因子列表
        self.share_factors = share_factors

    def validate(self):
        self.validate_required(self.biz_tag, 'biz_tag')
        if self.biz_tag:
            self.biz_tag.validate()
        self.validate_required(self.sub_type, 'sub_type')
        self.validate_required(self.transfer_target_type, 'transfer_target_type')
        self.validate_required(self.transfer_data, 'transfer_data')
        self.validate_required(self.skill_group_no, 'skill_group_no')
        self.validate_required(self.ext_info, 'ext_info')
        self.validate_required(self.biz_achieve, 'biz_achieve')
        self.validate_required(self.voice_type, 'voice_type')
        self.validate_required(self.model_type, 'model_type')
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.llm_labels, 'llm_labels')
        self.validate_required(self.required, 'required')
        self.validate_required(self.repeat_time, 'repeat_time')
        self.validate_required(self.interruptable, 'interruptable')
        self.validate_required(self.sts, 'sts')
        self.validate_required(self.appkey, 'appkey')
        self.validate_required(self.post_interaction_component, 'post_interaction_component')
        self.validate_required(self.corpus_choose_strategy, 'corpus_choose_strategy')
        self.validate_required(self.corpus_choose_model_url, 'corpus_choose_model_url')
        self.validate_required(self.corpus_choose_model_type, 'corpus_choose_model_type')
        self.validate_required(self.global_intention, 'global_intention')
        self.validate_required(self.global_intention_reply, 'global_intention_reply')
        if self.global_intention_reply:
            self.global_intention_reply.validate()
        self.validate_required(self.button_type, 'button_type')
        self.validate_required(self.button_digit, 'button_digit')
        self.validate_required(self.button_terminator, 'button_terminator')
        self.validate_required(self.button_timeout, 'button_timeout')
        self.validate_required(self.button_validator, 'button_validator')
        self.validate_required(self.static_keys, 'static_keys')
        self.validate_required(self.static_key_previous, 'static_key_previous')
        self.validate_required(self.static_key_repeat, 'static_key_repeat')
        self.validate_required(self.static_key_skip_input_check, 'static_key_skip_input_check')
        self.validate_required(self.round, 'round')
        self.validate_required(self.language, 'language')
        self.validate_required(self.ie_instance_code, 'ie_instance_code')
        self.validate_required(self.sub_flow_fe_id, 'sub_flow_fe_id')
        self.validate_required(self.sub_flow_dynamic_id, 'sub_flow_dynamic_id')
        self.validate_required(self.sub_flow_input, 'sub_flow_input')
        if self.sub_flow_input:
            for k in self.sub_flow_input:
                if k:
                    k.validate()
        self.validate_required(self.start_params, 'start_params')
        if self.start_params:
            for k in self.start_params:
                if k:
                    k.validate()
        self.validate_required(self.allow_interaction_types, 'allow_interaction_types')
        self.validate_required(self.share_factors, 'share_factors')
        if self.share_factors:
            for k in self.share_factors:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_tag is not None:
            result['biz_tag'] = self.biz_tag.to_map()
        if self.sub_type is not None:
            result['sub_type'] = self.sub_type
        if self.transfer_target_type is not None:
            result['transfer_target_type'] = self.transfer_target_type
        if self.transfer_data is not None:
            result['transfer_data'] = self.transfer_data
        if self.skill_group_no is not None:
            result['skill_group_no'] = self.skill_group_no
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.biz_achieve is not None:
            result['biz_achieve'] = self.biz_achieve
        if self.voice_type is not None:
            result['voice_type'] = self.voice_type
        if self.model_type is not None:
            result['model_type'] = self.model_type
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.llm_labels is not None:
            result['llm_labels'] = self.llm_labels
        if self.required is not None:
            result['required'] = self.required
        if self.repeat_time is not None:
            result['repeat_time'] = self.repeat_time
        if self.interruptable is not None:
            result['interruptable'] = self.interruptable
        if self.sts is not None:
            result['sts'] = self.sts
        if self.appkey is not None:
            result['appkey'] = self.appkey
        if self.post_interaction_component is not None:
            result['post_interaction_component'] = self.post_interaction_component
        if self.corpus_choose_strategy is not None:
            result['corpus_choose_strategy'] = self.corpus_choose_strategy
        if self.corpus_choose_model_url is not None:
            result['corpus_choose_model_url'] = self.corpus_choose_model_url
        if self.corpus_choose_model_type is not None:
            result['corpus_choose_model_type'] = self.corpus_choose_model_type
        if self.global_intention is not None:
            result['global_intention'] = self.global_intention
        if self.global_intention_reply is not None:
            result['global_intention_reply'] = self.global_intention_reply.to_map()
        if self.button_type is not None:
            result['button_type'] = self.button_type
        if self.button_digit is not None:
            result['button_digit'] = self.button_digit
        if self.button_terminator is not None:
            result['button_terminator'] = self.button_terminator
        if self.button_timeout is not None:
            result['button_timeout'] = self.button_timeout
        if self.button_validator is not None:
            result['button_validator'] = self.button_validator
        if self.static_keys is not None:
            result['static_keys'] = self.static_keys
        if self.static_key_previous is not None:
            result['static_key_previous'] = self.static_key_previous
        if self.static_key_repeat is not None:
            result['static_key_repeat'] = self.static_key_repeat
        if self.static_key_skip_input_check is not None:
            result['static_key_skip_input_check'] = self.static_key_skip_input_check
        if self.round is not None:
            result['round'] = self.round
        if self.language is not None:
            result['language'] = self.language
        if self.ie_instance_code is not None:
            result['ie_instance_code'] = self.ie_instance_code
        if self.sub_flow_fe_id is not None:
            result['sub_flow_fe_id'] = self.sub_flow_fe_id
        if self.sub_flow_dynamic_id is not None:
            result['sub_flow_dynamic_id'] = self.sub_flow_dynamic_id
        result['sub_flow_input'] = []
        if self.sub_flow_input is not None:
            for k in self.sub_flow_input:
                result['sub_flow_input'].append(k.to_map() if k else None)
        result['start_params'] = []
        if self.start_params is not None:
            for k in self.start_params:
                result['start_params'].append(k.to_map() if k else None)
        if self.allow_interaction_types is not None:
            result['allow_interaction_types'] = self.allow_interaction_types
        result['share_factors'] = []
        if self.share_factors is not None:
            for k in self.share_factors:
                result['share_factors'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_tag') is not None:
            temp_model = Output()
            self.biz_tag = temp_model.from_map(m['biz_tag'])
        if m.get('sub_type') is not None:
            self.sub_type = m.get('sub_type')
        if m.get('transfer_target_type') is not None:
            self.transfer_target_type = m.get('transfer_target_type')
        if m.get('transfer_data') is not None:
            self.transfer_data = m.get('transfer_data')
        if m.get('skill_group_no') is not None:
            self.skill_group_no = m.get('skill_group_no')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('biz_achieve') is not None:
            self.biz_achieve = m.get('biz_achieve')
        if m.get('voice_type') is not None:
            self.voice_type = m.get('voice_type')
        if m.get('model_type') is not None:
            self.model_type = m.get('model_type')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('llm_labels') is not None:
            self.llm_labels = m.get('llm_labels')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('repeat_time') is not None:
            self.repeat_time = m.get('repeat_time')
        if m.get('interruptable') is not None:
            self.interruptable = m.get('interruptable')
        if m.get('sts') is not None:
            self.sts = m.get('sts')
        if m.get('appkey') is not None:
            self.appkey = m.get('appkey')
        if m.get('post_interaction_component') is not None:
            self.post_interaction_component = m.get('post_interaction_component')
        if m.get('corpus_choose_strategy') is not None:
            self.corpus_choose_strategy = m.get('corpus_choose_strategy')
        if m.get('corpus_choose_model_url') is not None:
            self.corpus_choose_model_url = m.get('corpus_choose_model_url')
        if m.get('corpus_choose_model_type') is not None:
            self.corpus_choose_model_type = m.get('corpus_choose_model_type')
        if m.get('global_intention') is not None:
            self.global_intention = m.get('global_intention')
        if m.get('global_intention_reply') is not None:
            temp_model = Output()
            self.global_intention_reply = temp_model.from_map(m['global_intention_reply'])
        if m.get('button_type') is not None:
            self.button_type = m.get('button_type')
        if m.get('button_digit') is not None:
            self.button_digit = m.get('button_digit')
        if m.get('button_terminator') is not None:
            self.button_terminator = m.get('button_terminator')
        if m.get('button_timeout') is not None:
            self.button_timeout = m.get('button_timeout')
        if m.get('button_validator') is not None:
            self.button_validator = m.get('button_validator')
        if m.get('static_keys') is not None:
            self.static_keys = m.get('static_keys')
        if m.get('static_key_previous') is not None:
            self.static_key_previous = m.get('static_key_previous')
        if m.get('static_key_repeat') is not None:
            self.static_key_repeat = m.get('static_key_repeat')
        if m.get('static_key_skip_input_check') is not None:
            self.static_key_skip_input_check = m.get('static_key_skip_input_check')
        if m.get('round') is not None:
            self.round = m.get('round')
        if m.get('language') is not None:
            self.language = m.get('language')
        if m.get('ie_instance_code') is not None:
            self.ie_instance_code = m.get('ie_instance_code')
        if m.get('sub_flow_fe_id') is not None:
            self.sub_flow_fe_id = m.get('sub_flow_fe_id')
        if m.get('sub_flow_dynamic_id') is not None:
            self.sub_flow_dynamic_id = m.get('sub_flow_dynamic_id')
        self.sub_flow_input = []
        if m.get('sub_flow_input') is not None:
            for k in m.get('sub_flow_input'):
                temp_model = Input()
                self.sub_flow_input.append(temp_model.from_map(k))
        self.start_params = []
        if m.get('start_params') is not None:
            for k in m.get('start_params'):
                temp_model = Input()
                self.start_params.append(temp_model.from_map(k))
        if m.get('allow_interaction_types') is not None:
            self.allow_interaction_types = m.get('allow_interaction_types')
        self.share_factors = []
        if m.get('share_factors') is not None:
            for k in m.get('share_factors'):
                temp_model = Input()
                self.share_factors.append(temp_model.from_map(k))
        return self


class Shape(TeaModel):
    def __init__(
        self,
        shape: str = None,
        edge_id: str = None,
        source_anchor: int = None,
        target_anchor: int = None,
    ):
        # 边的样式
        self.shape = shape
        # edgeId
        self.edge_id = edge_id
        # 边起点的锚点位置
        self.source_anchor = source_anchor
        # 边终点的锚点位置
        self.target_anchor = target_anchor

    def validate(self):
        self.validate_required(self.shape, 'shape')
        self.validate_required(self.edge_id, 'edge_id')
        self.validate_required(self.source_anchor, 'source_anchor')
        self.validate_required(self.target_anchor, 'target_anchor')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.shape is not None:
            result['shape'] = self.shape
        if self.edge_id is not None:
            result['edge_id'] = self.edge_id
        if self.source_anchor is not None:
            result['source_anchor'] = self.source_anchor
        if self.target_anchor is not None:
            result['target_anchor'] = self.target_anchor
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('shape') is not None:
            self.shape = m.get('shape')
        if m.get('edge_id') is not None:
            self.edge_id = m.get('edge_id')
        if m.get('source_anchor') is not None:
            self.source_anchor = m.get('source_anchor')
        if m.get('target_anchor') is not None:
            self.target_anchor = m.get('target_anchor')
        return self


class Edge(TeaModel):
    def __init__(
        self,
        edge_id: str = None,
        variable_map: str = None,
        front_condition_expression: List[str] = None,
        shape: Shape = None,
        source: str = None,
        target: str = None,
        priority: int = None,
    ):
        # 边的id，这个是前端生成的，用于图关系
        self.edge_id = edge_id
        # key为上面content中的变量value为名称
        self.variable_map = variable_map
        # 边的规则表达式
        self.front_condition_expression = front_condition_expression
        # 前端图形相关
        self.shape = shape
        # 边连接的上一个节点的feId
        self.source = source
        # 边连接的下一个节点的feId
        self.target = target
        # 优先级，0~999
        self.priority = priority

    def validate(self):
        self.validate_required(self.edge_id, 'edge_id')
        self.validate_required(self.variable_map, 'variable_map')
        self.validate_required(self.front_condition_expression, 'front_condition_expression')
        self.validate_required(self.shape, 'shape')
        if self.shape:
            self.shape.validate()
        self.validate_required(self.source, 'source')
        self.validate_required(self.target, 'target')
        self.validate_required(self.priority, 'priority')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.edge_id is not None:
            result['edge_id'] = self.edge_id
        if self.variable_map is not None:
            result['variable_map'] = self.variable_map
        if self.front_condition_expression is not None:
            result['front_condition_expression'] = self.front_condition_expression
        if self.shape is not None:
            result['shape'] = self.shape.to_map()
        if self.source is not None:
            result['source'] = self.source
        if self.target is not None:
            result['target'] = self.target
        if self.priority is not None:
            result['priority'] = self.priority
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('edge_id') is not None:
            self.edge_id = m.get('edge_id')
        if m.get('variable_map') is not None:
            self.variable_map = m.get('variable_map')
        if m.get('front_condition_expression') is not None:
            self.front_condition_expression = m.get('front_condition_expression')
        if m.get('shape') is not None:
            temp_model = Shape()
            self.shape = temp_model.from_map(m['shape'])
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('target') is not None:
            self.target = m.get('target')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        return self


class Node(TeaModel):
    def __init__(
        self,
        node_id: str = None,
        node_name: str = None,
        node_type: str = None,
        x: int = None,
        y: int = None,
        node_info: NodeInfo = None,
        node_outputs: Output = None,
        first_outputs: List[Output] = None,
        node_video_output: Output = None,
        end_video_output: OutputGroup = None,
    ):
        # 节点的id
        self.node_id = node_id
        # 节点名称
        self.node_name = node_name
        # 节点类型
        self.node_type = node_type
        # 节点在画布的横向位置
        self.x = x
        # 节点在画布的纵向位置
        self.y = y
        # 节点配置信息
        self.node_info = node_info
        # 交互节点的首问播报
        self.node_outputs = node_outputs
        # 交互节点的新的首问播报
        self.first_outputs = first_outputs
        # 视频首句播报配置
        self.node_video_output = node_video_output
        # 视频结束配置
        self.end_video_output = end_video_output

    def validate(self):
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.node_name, 'node_name')
        self.validate_required(self.node_type, 'node_type')
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')
        self.validate_required(self.node_info, 'node_info')
        if self.node_info:
            self.node_info.validate()
        self.validate_required(self.node_outputs, 'node_outputs')
        if self.node_outputs:
            self.node_outputs.validate()
        self.validate_required(self.first_outputs, 'first_outputs')
        if self.first_outputs:
            for k in self.first_outputs:
                if k:
                    k.validate()
        self.validate_required(self.node_video_output, 'node_video_output')
        if self.node_video_output:
            self.node_video_output.validate()
        self.validate_required(self.end_video_output, 'end_video_output')
        if self.end_video_output:
            self.end_video_output.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.node_name is not None:
            result['node_name'] = self.node_name
        if self.node_type is not None:
            result['node_type'] = self.node_type
        if self.x is not None:
            result['x'] = self.x
        if self.y is not None:
            result['y'] = self.y
        if self.node_info is not None:
            result['node_info'] = self.node_info.to_map()
        if self.node_outputs is not None:
            result['node_outputs'] = self.node_outputs.to_map()
        result['first_outputs'] = []
        if self.first_outputs is not None:
            for k in self.first_outputs:
                result['first_outputs'].append(k.to_map() if k else None)
        if self.node_video_output is not None:
            result['node_video_output'] = self.node_video_output.to_map()
        if self.end_video_output is not None:
            result['end_video_output'] = self.end_video_output.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('node_name') is not None:
            self.node_name = m.get('node_name')
        if m.get('node_type') is not None:
            self.node_type = m.get('node_type')
        if m.get('x') is not None:
            self.x = m.get('x')
        if m.get('y') is not None:
            self.y = m.get('y')
        if m.get('node_info') is not None:
            temp_model = NodeInfo()
            self.node_info = temp_model.from_map(m['node_info'])
        if m.get('node_outputs') is not None:
            temp_model = Output()
            self.node_outputs = temp_model.from_map(m['node_outputs'])
        self.first_outputs = []
        if m.get('first_outputs') is not None:
            for k in m.get('first_outputs'):
                temp_model = Output()
                self.first_outputs.append(temp_model.from_map(k))
        if m.get('node_video_output') is not None:
            temp_model = Output()
            self.node_video_output = temp_model.from_map(m['node_video_output'])
        if m.get('end_video_output') is not None:
            temp_model = OutputGroup()
            self.end_video_output = temp_model.from_map(m['end_video_output'])
        return self


class Page(TeaModel):
    def __init__(
        self,
        curreny_page: int = None,
        page_size: int = None,
        total: int = None,
    ):
        # 页码
        self.curreny_page = curreny_page
        # 每页数据个数
        self.page_size = page_size
        # 总页数
        self.total = total

    def validate(self):
        self.validate_required(self.curreny_page, 'curreny_page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total, 'total')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.curreny_page is not None:
            result['curreny_page'] = self.curreny_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('curreny_page') is not None:
            self.curreny_page = m.get('curreny_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class OutboundDialogFlowDetailResponseData(TeaModel):
    def __init__(
        self,
        id: int = None,
        fe_id: str = None,
        name: str = None,
        version: int = None,
        versions: List[int] = None,
        global_config: str = None,
        type: str = None,
        temporary_storage_code: str = None,
        flow_interactive_type: str = None,
        edges: List[Edge] = None,
        nodes: List[Node] = None,
    ):
        # 数据库自增id
        self.id = id
        # 前端生成的随机字符串id
        self.fe_id = fe_id
        # 流程名称
        self.name = name
        # 流程当前版本号
        self.version = version
        # 流程版本号集合
        self.versions = versions
        # 全局配置
        self.global_config = global_config
        # 流程类型
        self.type = type
        # 暂存code
        self.temporary_storage_code = temporary_storage_code
        # 视频播报类型
        self.flow_interactive_type = flow_interactive_type
        # 流程图边数据
        self.edges = edges
        # 流程图节点数据
        self.nodes = nodes

    def validate(self):
        self.validate_required(self.fe_id, 'fe_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.version, 'version')
        self.validate_required(self.versions, 'versions')
        self.validate_required(self.global_config, 'global_config')
        self.validate_required(self.type, 'type')
        self.validate_required(self.temporary_storage_code, 'temporary_storage_code')
        self.validate_required(self.flow_interactive_type, 'flow_interactive_type')
        self.validate_required(self.edges, 'edges')
        if self.edges:
            for k in self.edges:
                if k:
                    k.validate()
        self.validate_required(self.nodes, 'nodes')
        if self.nodes:
            for k in self.nodes:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.fe_id is not None:
            result['fe_id'] = self.fe_id
        if self.name is not None:
            result['name'] = self.name
        if self.version is not None:
            result['version'] = self.version
        if self.versions is not None:
            result['versions'] = self.versions
        if self.global_config is not None:
            result['global_config'] = self.global_config
        if self.type is not None:
            result['type'] = self.type
        if self.temporary_storage_code is not None:
            result['temporary_storage_code'] = self.temporary_storage_code
        if self.flow_interactive_type is not None:
            result['flow_interactive_type'] = self.flow_interactive_type
        result['edges'] = []
        if self.edges is not None:
            for k in self.edges:
                result['edges'].append(k.to_map() if k else None)
        result['nodes'] = []
        if self.nodes is not None:
            for k in self.nodes:
                result['nodes'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('fe_id') is not None:
            self.fe_id = m.get('fe_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('versions') is not None:
            self.versions = m.get('versions')
        if m.get('global_config') is not None:
            self.global_config = m.get('global_config')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('temporary_storage_code') is not None:
            self.temporary_storage_code = m.get('temporary_storage_code')
        if m.get('flow_interactive_type') is not None:
            self.flow_interactive_type = m.get('flow_interactive_type')
        self.edges = []
        if m.get('edges') is not None:
            for k in m.get('edges'):
                temp_model = Edge()
                self.edges.append(temp_model.from_map(k))
        self.nodes = []
        if m.get('nodes') is not None:
            for k in m.get('nodes'):
                temp_model = Node()
                self.nodes.append(temp_model.from_map(k))
        return self


class OutboundPhoneResponseData(TeaModel):
    def __init__(
        self,
        acid: str = None,
        asyn: bool = None,
        outcall_request_id: str = None,
        asyn_db_id: str = None,
    ):
        # 通话唯一ID
        self.acid = acid
        # 是否同步
        self.asyn = asyn
        # 外呼ID
        self.outcall_request_id = outcall_request_id
        # 外呼DB的ID
        self.asyn_db_id = asyn_db_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.acid is not None:
            result['acid'] = self.acid
        if self.asyn is not None:
            result['asyn'] = self.asyn
        if self.outcall_request_id is not None:
            result['outcall_request_id'] = self.outcall_request_id
        if self.asyn_db_id is not None:
            result['asyn_db_id'] = self.asyn_db_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('acid') is not None:
            self.acid = m.get('acid')
        if m.get('asyn') is not None:
            self.asyn = m.get('asyn')
        if m.get('outcall_request_id') is not None:
            self.outcall_request_id = m.get('outcall_request_id')
        if m.get('asyn_db_id') is not None:
            self.asyn_db_id = m.get('asyn_db_id')
        return self


class OutboundTaskListResponseData(TeaModel):
    def __init__(
        self,
        id: int = None,
        name: str = None,
        code: str = None,
        flow_feld: str = None,
        flow_id: int = None,
        flow_name: str = None,
        flow_env: str = None,
        rule_id: int = None,
        rule_name: str = None,
        status: str = None,
        version: int = None,
        flow_version: int = None,
        flow_latest_version: int = None,
        rule_version: int = None,
        rule_latest_version: int = None,
        latest_version: int = None,
        pub_version: int = None,
        publishing: bool = None,
    ):
        # 任务数据库id
        self.id = id
        # 任务名称
        self.name = name
        # 任务id
        self.code = code
        # 流程前端id/流程code
        self.flow_feld = flow_feld
        # 流程id
        self.flow_id = flow_id
        # 流程名称
        self.flow_name = flow_name
        # 流程环境区分
        # PRE——预发
        # PUB——线上
        self.flow_env = flow_env
        # 规则id
        self.rule_id = rule_id
        # 规则名称
        self.rule_name = rule_name
        # 状态
        # USING-启用
        # UNUSED-不启用
        # DELETED-已删除
        self.status = status
        # 当前任务版本号
        self.version = version
        # 当前引用流程版本号
        self.flow_version = flow_version
        # 流程最新的版本号
        self.flow_latest_version = flow_latest_version
        # 当前引用规则版本号
        self.rule_version = rule_version
        # 规则最新的版本号
        self.rule_latest_version = rule_latest_version
        # 任务最新的版本号
        self.latest_version = latest_version
        # 任务线上版本号
        self.pub_version = pub_version
        # 任务是否在发布流程中
        self.publishing = publishing

    def validate(self):
        self.validate_required(self.publishing, 'publishing')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.code is not None:
            result['code'] = self.code
        if self.flow_feld is not None:
            result['flow_feld'] = self.flow_feld
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.flow_name is not None:
            result['flow_name'] = self.flow_name
        if self.flow_env is not None:
            result['flow_env'] = self.flow_env
        if self.rule_id is not None:
            result['rule_id'] = self.rule_id
        if self.rule_name is not None:
            result['rule_name'] = self.rule_name
        if self.status is not None:
            result['status'] = self.status
        if self.version is not None:
            result['version'] = self.version
        if self.flow_version is not None:
            result['flow_version'] = self.flow_version
        if self.flow_latest_version is not None:
            result['flow_latest_version'] = self.flow_latest_version
        if self.rule_version is not None:
            result['rule_version'] = self.rule_version
        if self.rule_latest_version is not None:
            result['rule_latest_version'] = self.rule_latest_version
        if self.latest_version is not None:
            result['latest_version'] = self.latest_version
        if self.pub_version is not None:
            result['pub_version'] = self.pub_version
        if self.publishing is not None:
            result['publishing'] = self.publishing
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('flow_feld') is not None:
            self.flow_feld = m.get('flow_feld')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('flow_name') is not None:
            self.flow_name = m.get('flow_name')
        if m.get('flow_env') is not None:
            self.flow_env = m.get('flow_env')
        if m.get('rule_id') is not None:
            self.rule_id = m.get('rule_id')
        if m.get('rule_name') is not None:
            self.rule_name = m.get('rule_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('flow_version') is not None:
            self.flow_version = m.get('flow_version')
        if m.get('flow_latest_version') is not None:
            self.flow_latest_version = m.get('flow_latest_version')
        if m.get('rule_version') is not None:
            self.rule_version = m.get('rule_version')
        if m.get('rule_latest_version') is not None:
            self.rule_latest_version = m.get('rule_latest_version')
        if m.get('latest_version') is not None:
            self.latest_version = m.get('latest_version')
        if m.get('pub_version') is not None:
            self.pub_version = m.get('pub_version')
        if m.get('publishing') is not None:
            self.publishing = m.get('publishing')
        return self


class ImportAntchainAioOutboundPhoneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_code: str = None,
        user_phone: str = None,
        user_id: str = None,
        idempotence_id: str = None,
        biz_ext_info: str = None,
        outcall_timestamp: int = None,
        expiration_timestamp: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_code = task_code
        # 收单手机号
        self.user_phone = user_phone
        # 用户ID
        self.user_id = user_id
        # 幂等控制参数，可以为空。为空时不进行幂等控
        self.idempotence_id = idempotence_id
        # 业务系统在外呼时传入额外参数,json格式
        self.biz_ext_info = biz_ext_info
        # 计划外呼执行时间时间戳。默认为当前时间。单位毫秒
        self.outcall_timestamp = outcall_timestamp
        # 计划外呼过期时间戳。 必须填写，一般为当天22:30左右。单位毫秒
        self.expiration_timestamp = expiration_timestamp

    def validate(self):
        self.validate_required(self.task_code, 'task_code')
        self.validate_required(self.user_phone, 'user_phone')
        self.validate_required(self.expiration_timestamp, 'expiration_timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_code is not None:
            result['task_code'] = self.task_code
        if self.user_phone is not None:
            result['user_phone'] = self.user_phone
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.idempotence_id is not None:
            result['idempotence_id'] = self.idempotence_id
        if self.biz_ext_info is not None:
            result['biz_ext_info'] = self.biz_ext_info
        if self.outcall_timestamp is not None:
            result['outcall_timestamp'] = self.outcall_timestamp
        if self.expiration_timestamp is not None:
            result['expiration_timestamp'] = self.expiration_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_code') is not None:
            self.task_code = m.get('task_code')
        if m.get('user_phone') is not None:
            self.user_phone = m.get('user_phone')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('idempotence_id') is not None:
            self.idempotence_id = m.get('idempotence_id')
        if m.get('biz_ext_info') is not None:
            self.biz_ext_info = m.get('biz_ext_info')
        if m.get('outcall_timestamp') is not None:
            self.outcall_timestamp = m.get('outcall_timestamp')
        if m.get('expiration_timestamp') is not None:
            self.expiration_timestamp = m.get('expiration_timestamp')
        return self


class ImportAntchainAioOutboundPhoneResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        code: str = None,
        message: str = None,
        data: OutboundPhoneResponseData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.success = success
        # 返回码
        self.code = code
        # 描述
        self.message = message
        # 内容
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            temp_model = OutboundPhoneResponseData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryAntchainAioOutboundTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        flow_id: int = None,
        env: str = None,
        ldc_name: str = None,
        status: str = None,
        tnt_inst_id: str = None,
        biz_code: str = None,
        current_page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务名称
        self.name = name
        # 外呼流程id
        self.flow_id = flow_id
        # 环境区分
        self.env = env
        # 与env对应
        self.ldc_name = ldc_name
        # 根据状态过滤数据
        self.status = status
        # 租户id
        self.tnt_inst_id = tnt_inst_id
        # 业务id
        self.biz_code = biz_code
        # 当前页码
        self.current_page = current_page
        # 每页数据个数
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.env, 'env')
        self.validate_required(self.ldc_name, 'ldc_name')
        self.validate_required(self.tnt_inst_id, 'tnt_inst_id')
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.env is not None:
            result['env'] = self.env
        if self.ldc_name is not None:
            result['ldc_name'] = self.ldc_name
        if self.status is not None:
            result['status'] = self.status
        if self.tnt_inst_id is not None:
            result['tnt_inst_id'] = self.tnt_inst_id
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('ldc_name') is not None:
            self.ldc_name = m.get('ldc_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('tnt_inst_id') is not None:
            self.tnt_inst_id = m.get('tnt_inst_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryAntchainAioOutboundTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: List[OutboundTaskListResponseData] = None,
        stat: Page = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求是否成功
        self.success = success
        # 请求结果说明
        self.message = message
        # 接口业务数据
        self.data = data
        # 其他统计类数据
        self.stat = stat

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()
        if self.stat:
            self.stat.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        if self.message is not None:
            result['message'] = self.message
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.stat is not None:
            result['stat'] = self.stat.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('message') is not None:
            self.message = m.get('message')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = OutboundTaskListResponseData()
                self.data.append(temp_model.from_map(k))
        if m.get('stat') is not None:
            temp_model = Page()
            self.stat = temp_model.from_map(m['stat'])
        return self


class QueryAntchainAioOutboundDialogflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        tnt_inst_id: str = None,
        biz_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务id
        self.id = id
        # 租户id
        self.tnt_inst_id = tnt_inst_id
        # 业务id
        self.biz_code = biz_code

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.tnt_inst_id, 'tnt_inst_id')
        self.validate_required(self.biz_code, 'biz_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.tnt_inst_id is not None:
            result['tnt_inst_id'] = self.tnt_inst_id
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('tnt_inst_id') is not None:
            self.tnt_inst_id = m.get('tnt_inst_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        return self


class QueryAntchainAioOutboundDialogflowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: OutboundDialogFlowDetailResponseData = None,
        trace_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求是否成功
        # 
        self.success = success
        # 请求结果说明
        # 
        self.message = message
        # 接口业务数据
        # 
        self.data = data
        # traceId
        self.trace_id = trace_id

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        if self.message is not None:
            result['message'] = self.message
        if self.data is not None:
            result['data'] = self.data.to_map()
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            temp_model = OutboundDialogFlowDetailResponseData()
            self.data = temp_model.from_map(m['data'])
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        return self


class QueryAntchainAioOutboundRecordurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tnt_inst_id: str = None,
        biz_code: str = None,
        acid: str = None,
        call_request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tnt_inst_id = tnt_inst_id
        # 业务code
        self.biz_code = biz_code
        # acid
        self.acid = acid
        # callRequestId
        self.call_request_id = call_request_id

    def validate(self):
        self.validate_required(self.tnt_inst_id, 'tnt_inst_id')
        self.validate_required(self.biz_code, 'biz_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tnt_inst_id is not None:
            result['tnt_inst_id'] = self.tnt_inst_id
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.acid is not None:
            result['acid'] = self.acid
        if self.call_request_id is not None:
            result['call_request_id'] = self.call_request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tnt_inst_id') is not None:
            self.tnt_inst_id = m.get('tnt_inst_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('acid') is not None:
            self.acid = m.get('acid')
        if m.get('call_request_id') is not None:
            self.call_request_id = m.get('call_request_id')
        return self


class QueryAntchainAioOutboundRecordurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求是否成功
        # 
        self.success = success
        # 请求结果说明
        # 
        self.message = message
        # 录音下载地址
        self.data = data

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        if self.message is not None:
            result['message'] = self.message
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


