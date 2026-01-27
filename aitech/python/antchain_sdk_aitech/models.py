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


class QRCodeDetail(TeaModel):
    def __init__(
        self,
        location: List[int] = None,
        type: str = None,
        content: str = None,
        probability: str = None,
    ):
        # 位置，Top、Left、Width、Height
        self.location = location
        # 二维码类型
        self.type = type
        # 二维码内容
        self.content = content
        # 置信度
        self.probability = probability

    def validate(self):
        self.validate_required(self.location, 'location')
        self.validate_required(self.type, 'type')
        self.validate_required(self.content, 'content')
        self.validate_required(self.probability, 'probability')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.location is not None:
            result['location'] = self.location
        if self.type is not None:
            result['type'] = self.type
        if self.content is not None:
            result['content'] = self.content
        if self.probability is not None:
            result['probability'] = self.probability
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('probability') is not None:
            self.probability = m.get('probability')
        return self


class LogoDetail(TeaModel):
    def __init__(
        self,
        location: List[int] = None,
        type: str = None,
        probability: str = None,
    ):
        # 位置，Top、Left、Width、Height
        self.location = location
        # 类型
        self.type = type
        # 置信度
        self.probability = probability

    def validate(self):
        self.validate_required(self.location, 'location')
        self.validate_required(self.type, 'type')
        self.validate_required(self.probability, 'probability')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.location is not None:
            result['location'] = self.location
        if self.type is not None:
            result['type'] = self.type
        if self.probability is not None:
            result['probability'] = self.probability
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('probability') is not None:
            self.probability = m.get('probability')
        return self


class MayaRedGptResponseDTO(TeaModel):
    def __init__(
        self,
        message_id: str = None,
        request_id: str = None,
        session_id: str = None,
        answer: str = None,
        answer_format: str = None,
        answer_end: bool = None,
        safe: bool = None,
    ):
        # 消息的ID
        self.message_id = message_id
        # 请求ID
        self.request_id = request_id
        # 会话ID
        self.session_id = session_id
        # 应答内容
        self.answer = answer
        # 应答内容格式
        self.answer_format = answer_format
        # 是否回答结束
        self.answer_end = answer_end
        # 是否问题有风险
        self.safe = safe

    def validate(self):
        self.validate_required(self.message_id, 'message_id')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.answer, 'answer')
        self.validate_required(self.answer_format, 'answer_format')
        self.validate_required(self.answer_end, 'answer_end')
        self.validate_required(self.safe, 'safe')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.answer is not None:
            result['answer'] = self.answer
        if self.answer_format is not None:
            result['answer_format'] = self.answer_format
        if self.answer_end is not None:
            result['answer_end'] = self.answer_end
        if self.safe is not None:
            result['safe'] = self.safe
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('answer') is not None:
            self.answer = m.get('answer')
        if m.get('answer_format') is not None:
            self.answer_format = m.get('answer_format')
        if m.get('answer_end') is not None:
            self.answer_end = m.get('answer_end')
        if m.get('safe') is not None:
            self.safe = m.get('safe')
        return self


class AuditSyncLabel(TeaModel):
    def __init__(
        self,
        label: str = None,
        probability: int = None,
        description: str = None,
        risk_words: str = None,
    ):
        # 标签名：sex-色情
        self.label = label
        # 检测到单个风险标签的置信度：66.25
        self.probability = probability
        # 风险标签说明
        self.description = description
        # 检测到的敏感词，多个词用逗号分隔，部分标签不会返回敏感词：AA,BB,CC
        self.risk_words = risk_words

    def validate(self):
        self.validate_required(self.label, 'label')
        self.validate_required(self.probability, 'probability')
        self.validate_required(self.risk_words, 'risk_words')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.label is not None:
            result['label'] = self.label
        if self.probability is not None:
            result['probability'] = self.probability
        if self.description is not None:
            result['description'] = self.description
        if self.risk_words is not None:
            result['risk_words'] = self.risk_words
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('label') is not None:
            self.label = m.get('label')
        if m.get('probability') is not None:
            self.probability = m.get('probability')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('risk_words') is not None:
            self.risk_words = m.get('risk_words')
        return self


class QRCodeAuditResult(TeaModel):
    def __init__(
        self,
        detect_num: int = None,
        details: List[QRCodeDetail] = None,
    ):
        # 检测到二维码个数
        self.detect_num = detect_num
        # 二维码详情
        self.details = details

    def validate(self):
        self.validate_required(self.detect_num, 'detect_num')
        self.validate_required(self.details, 'details')
        if self.details:
            for k in self.details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.detect_num is not None:
            result['detect_num'] = self.detect_num
        result['details'] = []
        if self.details is not None:
            for k in self.details:
                result['details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('detect_num') is not None:
            self.detect_num = m.get('detect_num')
        self.details = []
        if m.get('details') is not None:
            for k in m.get('details'):
                temp_model = QRCodeDetail()
                self.details.append(temp_model.from_map(k))
        return self


class AttackSubLabel(TeaModel):
    def __init__(
        self,
        attack_sub_label: str = None,
    ):
        # 提示词攻击手法二级标签
        self.attack_sub_label = attack_sub_label

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.attack_sub_label is not None:
            result['attack_sub_label'] = self.attack_sub_label
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('attack_sub_label') is not None:
            self.attack_sub_label = m.get('attack_sub_label')
        return self


class MeiyouTopicWebInfo(TeaModel):
    def __init__(
        self,
        content: str = None,
        current_floor: int = None,
        call_back_floor: int = None,
        publish_time: int = None,
        images: str = None,
        user_nickname: str = None,
        user_id: str = None,
        user_type: str = None,
        user_avatar: str = None,
        topic_id: int = None,
        call_back_floor_content: str = None,
        oss_images: str = None,
    ):
        # 内容文本
        self.content = content
        # 当前楼层
        self.current_floor = current_floor
        # 回复楼层
        self.call_back_floor = call_back_floor
        # 发布时间戳(毫秒)
        # 
        self.publish_time = publish_time
        # 图片URL数组(JSON字符串)
        self.images = images
        # 用户昵称
        self.user_nickname = user_nickname
        # 用户ID
        self.user_id = user_id
        # 用户类型
        # 
        self.user_type = user_type
        # 用户头像URL
        self.user_avatar = user_avatar
        # 主题ID
        self.topic_id = topic_id
        # 回复楼信息
        self.call_back_floor_content = call_back_floor_content
        # oss存储地址
        self.oss_images = oss_images

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content is not None:
            result['content'] = self.content
        if self.current_floor is not None:
            result['current_floor'] = self.current_floor
        if self.call_back_floor is not None:
            result['call_back_floor'] = self.call_back_floor
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.images is not None:
            result['images'] = self.images
        if self.user_nickname is not None:
            result['user_nickname'] = self.user_nickname
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_avatar is not None:
            result['user_avatar'] = self.user_avatar
        if self.topic_id is not None:
            result['topic_id'] = self.topic_id
        if self.call_back_floor_content is not None:
            result['call_back_floor_content'] = self.call_back_floor_content
        if self.oss_images is not None:
            result['oss_images'] = self.oss_images
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('current_floor') is not None:
            self.current_floor = m.get('current_floor')
        if m.get('call_back_floor') is not None:
            self.call_back_floor = m.get('call_back_floor')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('images') is not None:
            self.images = m.get('images')
        if m.get('user_nickname') is not None:
            self.user_nickname = m.get('user_nickname')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_avatar') is not None:
            self.user_avatar = m.get('user_avatar')
        if m.get('topic_id') is not None:
            self.topic_id = m.get('topic_id')
        if m.get('call_back_floor_content') is not None:
            self.call_back_floor_content = m.get('call_back_floor_content')
        if m.get('oss_images') is not None:
            self.oss_images = m.get('oss_images')
        return self


class MayaStreamResult(TeaModel):
    def __init__(
        self,
        data: MayaRedGptResponseDTO = None,
        success: bool = None,
        error_code: str = None,
        error_msg: str = None,
    ):
        # maya响应数据
        self.data = data
        # 是否成功
        self.success = success
        # 错误码
        self.error_code = error_code
        # 错误信息
        self.error_msg = error_msg

    def validate(self):
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()
        self.validate_required(self.success, 'success')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.error_msg, 'error_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data is not None:
            result['data'] = self.data.to_map()
        if self.success is not None:
            result['success'] = self.success
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data') is not None:
            temp_model = MayaRedGptResponseDTO()
            self.data = temp_model.from_map(m['data'])
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class SubLabelModel(TeaModel):
    def __init__(
        self,
        sub_label: str = None,
        risk_words: List[str] = None,
        risk_words_index: List[str] = None,
        third_labels: List[str] = None,
    ):
        # 二级标签
        self.sub_label = sub_label
        # 风险关键词列表
        self.risk_words = risk_words
        # 风险关键词索引列表
        self.risk_words_index = risk_words_index
        # 三级标签列表
        self.third_labels = third_labels

    def validate(self):
        self.validate_required(self.sub_label, 'sub_label')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sub_label is not None:
            result['sub_label'] = self.sub_label
        if self.risk_words is not None:
            result['risk_words'] = self.risk_words
        if self.risk_words_index is not None:
            result['risk_words_index'] = self.risk_words_index
        if self.third_labels is not None:
            result['third_labels'] = self.third_labels
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sub_label') is not None:
            self.sub_label = m.get('sub_label')
        if m.get('risk_words') is not None:
            self.risk_words = m.get('risk_words')
        if m.get('risk_words_index') is not None:
            self.risk_words_index = m.get('risk_words_index')
        if m.get('third_labels') is not None:
            self.third_labels = m.get('third_labels')
        return self


class LogoAuditResult(TeaModel):
    def __init__(
        self,
        detect_num: int = None,
        details: List[LogoDetail] = None,
    ):
        # 检测到LOGO个数
        self.detect_num = detect_num
        # LOGO详情
        self.details = details

    def validate(self):
        self.validate_required(self.detect_num, 'detect_num')
        self.validate_required(self.details, 'details')
        if self.details:
            for k in self.details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.detect_num is not None:
            result['detect_num'] = self.detect_num
        result['details'] = []
        if self.details is not None:
            for k in self.details:
                result['details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('detect_num') is not None:
            self.detect_num = m.get('detect_num')
        self.details = []
        if m.get('details') is not None:
            for k in m.get('details'):
                temp_model = LogoDetail()
                self.details.append(temp_model.from_map(k))
        return self


class FieldModel(TeaModel):
    def __init__(
        self,
        field_category: str = None,
        field_label: str = None,
        field_score: int = None,
    ):
        # 领域一级标签
        self.field_category = field_category
        # 领域二级标签
        self.field_label = field_label
        # 领域一级标签的等级分数
        self.field_score = field_score

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.field_category is not None:
            result['field_category'] = self.field_category
        if self.field_label is not None:
            result['field_label'] = self.field_label
        if self.field_score is not None:
            result['field_score'] = self.field_score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('field_category') is not None:
            self.field_category = m.get('field_category')
        if m.get('field_label') is not None:
            self.field_label = m.get('field_label')
        if m.get('field_score') is not None:
            self.field_score = m.get('field_score')
        return self


class MeiyouAuditSaveWebRequest(TeaModel):
    def __init__(
        self,
        audit_id: int = None,
        topic_id: int = None,
        content: str = None,
        publish_time: int = None,
        images: str = None,
        primary_business: str = None,
        secondary_business: str = None,
        user_nickname: str = None,
        user_id: str = None,
        user_type: str = None,
        user_avatar: str = None,
        audit_operator: str = None,
        audit_floor: int = None,
        version: str = None,
        topic_infos: List[MeiyouTopicWebInfo] = None,
    ):
        # 审核记录ID
        self.audit_id = audit_id
        # 主题ID
        self.topic_id = topic_id
        # 内容文本
        self.content = content
        # 发布时间戳(毫秒)
        self.publish_time = publish_time
        # 图片URL数组(JSON字符串)
        self.images = images
        # 一级业务
        self.primary_business = primary_business
        # 二级业务
        self.secondary_business = secondary_business
        # 用户昵称
        self.user_nickname = user_nickname
        # 用户ID
        self.user_id = user_id
        # 用户类型
        self.user_type = user_type
        # 用户头像URL
        self.user_avatar = user_avatar
        # 操作人
        self.audit_operator = audit_operator
        # 审核楼
        self.audit_floor = audit_floor
        # 版本
        self.version = version
        # 主题信息
        self.topic_infos = topic_infos

    def validate(self):
        if self.topic_infos:
            for k in self.topic_infos:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.audit_id is not None:
            result['audit_id'] = self.audit_id
        if self.topic_id is not None:
            result['topic_id'] = self.topic_id
        if self.content is not None:
            result['content'] = self.content
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.images is not None:
            result['images'] = self.images
        if self.primary_business is not None:
            result['primary_business'] = self.primary_business
        if self.secondary_business is not None:
            result['secondary_business'] = self.secondary_business
        if self.user_nickname is not None:
            result['user_nickname'] = self.user_nickname
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_avatar is not None:
            result['user_avatar'] = self.user_avatar
        if self.audit_operator is not None:
            result['audit_operator'] = self.audit_operator
        if self.audit_floor is not None:
            result['audit_floor'] = self.audit_floor
        if self.version is not None:
            result['version'] = self.version
        result['topic_infos'] = []
        if self.topic_infos is not None:
            for k in self.topic_infos:
                result['topic_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('audit_id') is not None:
            self.audit_id = m.get('audit_id')
        if m.get('topic_id') is not None:
            self.topic_id = m.get('topic_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('images') is not None:
            self.images = m.get('images')
        if m.get('primary_business') is not None:
            self.primary_business = m.get('primary_business')
        if m.get('secondary_business') is not None:
            self.secondary_business = m.get('secondary_business')
        if m.get('user_nickname') is not None:
            self.user_nickname = m.get('user_nickname')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_avatar') is not None:
            self.user_avatar = m.get('user_avatar')
        if m.get('audit_operator') is not None:
            self.audit_operator = m.get('audit_operator')
        if m.get('audit_floor') is not None:
            self.audit_floor = m.get('audit_floor')
        if m.get('version') is not None:
            self.version = m.get('version')
        self.topic_infos = []
        if m.get('topic_infos') is not None:
            for k in m.get('topic_infos'):
                temp_model = MeiyouTopicWebInfo()
                self.topic_infos.append(temp_model.from_map(k))
        return self


class AntCloudProdProviderHttpResponse(TeaModel):
    def __init__(
        self,
        response: MayaStreamResult = None,
        sign: str = None,
    ):
        # maya返回结果
        self.response = response
        # 签名
        self.sign = sign

    def validate(self):
        self.validate_required(self.response, 'response')
        if self.response:
            self.response.validate()
        self.validate_required(self.sign, 'sign')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.response is not None:
            result['response'] = self.response.to_map()
        if self.sign is not None:
            result['sign'] = self.sign
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('response') is not None:
            temp_model = MayaStreamResult()
            self.response = temp_model.from_map(m['response'])
        if m.get('sign') is not None:
            self.sign = m.get('sign')
        return self


class LabelModel(TeaModel):
    def __init__(
        self,
        label: str = None,
        sub_labels: List[SubLabelModel] = None,
    ):
        # 一级标签
        self.label = label
        # 子标签
        self.sub_labels = sub_labels

    def validate(self):
        if self.sub_labels:
            for k in self.sub_labels:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.label is not None:
            result['label'] = self.label
        result['sub_labels'] = []
        if self.sub_labels is not None:
            for k in self.sub_labels:
                result['sub_labels'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('label') is not None:
            self.label = m.get('label')
        self.sub_labels = []
        if m.get('sub_labels') is not None:
            for k in m.get('sub_labels'):
                temp_model = SubLabelModel()
                self.sub_labels.append(temp_model.from_map(k))
        return self


class TextSyncAuditResult(TeaModel):
    def __init__(
        self,
        task_id: str = None,
        data_id: str = None,
        business_id: str = None,
        risk_level: str = None,
        labels: List[AuditSyncLabel] = None,
    ):
        # 任务id
        self.task_id = task_id
        # 数据Id
        self.data_id = data_id
        # 业务Id - 调用方透传
        self.business_id = business_id
        # 风险等级，根据设置的高低风险分返回，返回值包括： - high：高风险（若命中自定义词库，风险等级默认为高风险） - medium：中风险 - low：低风险 - none：未检测到风险
        self.risk_level = risk_level
        # 审核标签列表
        self.labels = labels

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.data_id, 'data_id')
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.risk_level, 'risk_level')
        self.validate_required(self.labels, 'labels')
        if self.labels:
            for k in self.labels:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        result['labels'] = []
        if self.labels is not None:
            for k in self.labels:
                result['labels'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        self.labels = []
        if m.get('labels') is not None:
            for k in m.get('labels'):
                temp_model = AuditSyncLabel()
                self.labels.append(temp_model.from_map(k))
        return self


class MeiyouAuditSaveWebInfo(TeaModel):
    def __init__(
        self,
        topic_id: int = None,
        audit_id: int = None,
        content: str = None,
        publish_time: int = None,
        images: str = None,
        primary_business: str = None,
        secondary_business: str = None,
        user_nickname: str = None,
        user_id: str = None,
        user_type: str = None,
        user_avatar: str = None,
        topic_infos: MeiyouTopicWebInfo = None,
    ):
        # 主题ID
        self.topic_id = topic_id
        # 审核记录ID
        self.audit_id = audit_id
        # 内容文本
        self.content = content
        # 发布时间戳(毫秒)
        self.publish_time = publish_time
        # 图片URL数组(JSON字符串)
        self.images = images
        # 一级业务
        self.primary_business = primary_business
        # 二级业务
        self.secondary_business = secondary_business
        # 用户昵称
        self.user_nickname = user_nickname
        # 用户ID
        self.user_id = user_id
        # 用户类型
        # 
        self.user_type = user_type
        # 用户头像URL
        self.user_avatar = user_avatar
        # 主题信息
        self.topic_infos = topic_infos

    def validate(self):
        self.validate_required(self.audit_id, 'audit_id')
        if self.topic_infos:
            self.topic_infos.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.topic_id is not None:
            result['topic_id'] = self.topic_id
        if self.audit_id is not None:
            result['audit_id'] = self.audit_id
        if self.content is not None:
            result['content'] = self.content
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.images is not None:
            result['images'] = self.images
        if self.primary_business is not None:
            result['primary_business'] = self.primary_business
        if self.secondary_business is not None:
            result['secondary_business'] = self.secondary_business
        if self.user_nickname is not None:
            result['user_nickname'] = self.user_nickname
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_avatar is not None:
            result['user_avatar'] = self.user_avatar
        if self.topic_infos is not None:
            result['topic_infos'] = self.topic_infos.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('topic_id') is not None:
            self.topic_id = m.get('topic_id')
        if m.get('audit_id') is not None:
            self.audit_id = m.get('audit_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('images') is not None:
            self.images = m.get('images')
        if m.get('primary_business') is not None:
            self.primary_business = m.get('primary_business')
        if m.get('secondary_business') is not None:
            self.secondary_business = m.get('secondary_business')
        if m.get('user_nickname') is not None:
            self.user_nickname = m.get('user_nickname')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_avatar') is not None:
            self.user_avatar = m.get('user_avatar')
        if m.get('topic_infos') is not None:
            temp_model = MeiyouTopicWebInfo()
            self.topic_infos = temp_model.from_map(m['topic_infos'])
        return self


class ImageAuditResult(TeaModel):
    def __init__(
        self,
        task_id: str = None,
        data_id: str = None,
        logo_audit_result: LogoAuditResult = None,
        qr_code_audit_result: QRCodeAuditResult = None,
    ):
        # 任务ID
        self.task_id = task_id
        # 数据ID
        self.data_id = data_id
        # LOGO审核结果
        self.logo_audit_result = logo_audit_result
        # QRCode审核结果
        self.qr_code_audit_result = qr_code_audit_result

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.data_id, 'data_id')
        self.validate_required(self.logo_audit_result, 'logo_audit_result')
        if self.logo_audit_result:
            self.logo_audit_result.validate()
        self.validate_required(self.qr_code_audit_result, 'qr_code_audit_result')
        if self.qr_code_audit_result:
            self.qr_code_audit_result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.logo_audit_result is not None:
            result['logo_audit_result'] = self.logo_audit_result.to_map()
        if self.qr_code_audit_result is not None:
            result['qr_code_audit_result'] = self.qr_code_audit_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('logo_audit_result') is not None:
            temp_model = LogoAuditResult()
            self.logo_audit_result = temp_model.from_map(m['logo_audit_result'])
        if m.get('qr_code_audit_result') is not None:
            temp_model = QRCodeAuditResult()
            self.qr_code_audit_result = temp_model.from_map(m['qr_code_audit_result'])
        return self


class AttackLabel(TeaModel):
    def __init__(
        self,
        attack_label: str = None,
        attack_sub_labels: AttackSubLabel = None,
    ):
        # 提示词攻击手法一级标签
        self.attack_label = attack_label
        # 提示词攻击手法二级标签列表
        self.attack_sub_labels = attack_sub_labels

    def validate(self):
        if self.attack_sub_labels:
            self.attack_sub_labels.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.attack_label is not None:
            result['attack_label'] = self.attack_label
        if self.attack_sub_labels is not None:
            result['attack_sub_labels'] = self.attack_sub_labels.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('attack_label') is not None:
            self.attack_label = m.get('attack_label')
        if m.get('attack_sub_labels') is not None:
            temp_model = AttackSubLabel()
            self.attack_sub_labels = temp_model.from_map(m['attack_sub_labels'])
        return self


class MeiyouAuditInfo(TeaModel):
    def __init__(
        self,
        id: int = None,
        audit_id: int = None,
        topic_id: int = None,
        content: str = None,
        publish_time: str = None,
        images: str = None,
        primary_business: str = None,
        secondary_business: str = None,
        user_nickname: str = None,
        user_id: str = None,
        user_type: str = None,
        user_avatar: str = None,
        audit_result: str = None,
        audit_reason: str = None,
        audit_reason_msg: str = None,
        audit_operator: str = None,
        audit_time: str = None,
        oss_images: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
    ):
        # 主键id
        self.id = id
        # 审核记录ID
        self.audit_id = audit_id
        # 主题ID
        self.topic_id = topic_id
        # 内容文本
        self.content = content
        # 发布时间戳
        self.publish_time = publish_time
        # 图片URL数组(JSON字符串)
        self.images = images
        # 一级业务
        self.primary_business = primary_business
        # 二级业务
        self.secondary_business = secondary_business
        # 用户昵称
        self.user_nickname = user_nickname
        # 用户ID
        self.user_id = user_id
        # 用户类型
        self.user_type = user_type
        # 用户头像URL
        self.user_avatar = user_avatar
        # 审核结果
        self.audit_result = audit_result
        # 审核原因
        self.audit_reason = audit_reason
        # 审核原因
        self.audit_reason_msg = audit_reason_msg
        # 操作人
        self.audit_operator = audit_operator
        # 操作时间戳
        self.audit_time = audit_time
        # oss 转存后的图像地址
        self.oss_images = oss_images
        # 创建时间
        self.gmt_create = gmt_create
        # 更新时间
        self.gmt_modified = gmt_modified

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.audit_id, 'audit_id')
        if self.publish_time is not None:
            self.validate_pattern(self.publish_time, 'publish_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.audit_time is not None:
            self.validate_pattern(self.audit_time, 'audit_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.audit_id is not None:
            result['audit_id'] = self.audit_id
        if self.topic_id is not None:
            result['topic_id'] = self.topic_id
        if self.content is not None:
            result['content'] = self.content
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.images is not None:
            result['images'] = self.images
        if self.primary_business is not None:
            result['primary_business'] = self.primary_business
        if self.secondary_business is not None:
            result['secondary_business'] = self.secondary_business
        if self.user_nickname is not None:
            result['user_nickname'] = self.user_nickname
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_avatar is not None:
            result['user_avatar'] = self.user_avatar
        if self.audit_result is not None:
            result['audit_result'] = self.audit_result
        if self.audit_reason is not None:
            result['audit_reason'] = self.audit_reason
        if self.audit_reason_msg is not None:
            result['audit_reason_msg'] = self.audit_reason_msg
        if self.audit_operator is not None:
            result['audit_operator'] = self.audit_operator
        if self.audit_time is not None:
            result['audit_time'] = self.audit_time
        if self.oss_images is not None:
            result['oss_images'] = self.oss_images
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('audit_id') is not None:
            self.audit_id = m.get('audit_id')
        if m.get('topic_id') is not None:
            self.topic_id = m.get('topic_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('images') is not None:
            self.images = m.get('images')
        if m.get('primary_business') is not None:
            self.primary_business = m.get('primary_business')
        if m.get('secondary_business') is not None:
            self.secondary_business = m.get('secondary_business')
        if m.get('user_nickname') is not None:
            self.user_nickname = m.get('user_nickname')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_avatar') is not None:
            self.user_avatar = m.get('user_avatar')
        if m.get('audit_result') is not None:
            self.audit_result = m.get('audit_result')
        if m.get('audit_reason') is not None:
            self.audit_reason = m.get('audit_reason')
        if m.get('audit_reason_msg') is not None:
            self.audit_reason_msg = m.get('audit_reason_msg')
        if m.get('audit_operator') is not None:
            self.audit_operator = m.get('audit_operator')
        if m.get('audit_time') is not None:
            self.audit_time = m.get('audit_time')
        if m.get('oss_images') is not None:
            self.oss_images = m.get('oss_images')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class UpdateMeiyouItagRelationWebInfo(TeaModel):
    def __init__(
        self,
        id: int = None,
        audit_id: str = None,
        itag_data_id: int = None,
        meiyou_audit_state: str = None,
        refuse_reson: str = None,
        refuse_images: str = None,
        audit_state: str = None,
        topic_state: str = None,
        audit_result: str = None,
        audit_user: str = None,
        audit_time: int = None,
    ):
        # 主键id
        self.id = id
        # 审核记录ID
        self.audit_id = audit_id
        # itag数据ID
        self.itag_data_id = itag_data_id
        # 美柚任务审核结果推送状态
        self.meiyou_audit_state = meiyou_audit_state
        # 审核不通过原因
        self.refuse_reson = refuse_reson
        # 审核不通过图片序号
        self.refuse_images = refuse_images
        # 美柚itag关联状态
        self.audit_state = audit_state
        # 美柚itag关联状态
        self.topic_state = topic_state
        # 审核结果
        self.audit_result = audit_result
        # 审核人员
        self.audit_user = audit_user
        # 审核时间
        self.audit_time = audit_time

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.audit_id is not None:
            result['audit_id'] = self.audit_id
        if self.itag_data_id is not None:
            result['itag_data_id'] = self.itag_data_id
        if self.meiyou_audit_state is not None:
            result['meiyou_audit_state'] = self.meiyou_audit_state
        if self.refuse_reson is not None:
            result['refuse_reson'] = self.refuse_reson
        if self.refuse_images is not None:
            result['refuse_images'] = self.refuse_images
        if self.audit_state is not None:
            result['audit_state'] = self.audit_state
        if self.topic_state is not None:
            result['topic_state'] = self.topic_state
        if self.audit_result is not None:
            result['audit_result'] = self.audit_result
        if self.audit_user is not None:
            result['audit_user'] = self.audit_user
        if self.audit_time is not None:
            result['audit_time'] = self.audit_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('audit_id') is not None:
            self.audit_id = m.get('audit_id')
        if m.get('itag_data_id') is not None:
            self.itag_data_id = m.get('itag_data_id')
        if m.get('meiyou_audit_state') is not None:
            self.meiyou_audit_state = m.get('meiyou_audit_state')
        if m.get('refuse_reson') is not None:
            self.refuse_reson = m.get('refuse_reson')
        if m.get('refuse_images') is not None:
            self.refuse_images = m.get('refuse_images')
        if m.get('audit_state') is not None:
            self.audit_state = m.get('audit_state')
        if m.get('topic_state') is not None:
            self.topic_state = m.get('topic_state')
        if m.get('audit_result') is not None:
            self.audit_result = m.get('audit_result')
        if m.get('audit_user') is not None:
            self.audit_user = m.get('audit_user')
        if m.get('audit_time') is not None:
            self.audit_time = m.get('audit_time')
        return self


class ApplyAuditImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        sec_types: List[str] = None,
        scene: str = None,
        data_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 审核内容链接
        self.url = url
        # 审核类型列表
        self.sec_types = sec_types
        # 场景信息
        self.scene = scene
        # 数据Id,客户传入，唯一标识
        self.data_id = data_id

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.sec_types, 'sec_types')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.sec_types is not None:
            result['sec_types'] = self.sec_types
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('sec_types') is not None:
            self.sec_types = m.get('sec_types')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class ApplyAuditImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
        content_type: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID，必须唯一
        self.task_id = task_id
        # 数据ID，必须唯一
        self.data_id = data_id
        # 审核内容类型
        self.content_type = content_type
        # 审核结果
        self.result = result

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class CallbackSofaAuditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        payload: str = None,
        biz_scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 回执原文
        self.payload = payload
        # 回执场景
        self.biz_scene = biz_scene

    def validate(self):
        self.validate_required(self.payload, 'payload')
        self.validate_required(self.biz_scene, 'biz_scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.payload is not None:
            result['payload'] = self.payload
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('payload') is not None:
            self.payload = m.get('payload')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        return self


class CallbackSofaAuditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        error_code: str = None,
        error_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 错误码
        self.error_code = error_code
        # 错误原因
        self.error_message = error_message

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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class SubmitAuditTextRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: str = None,
        scene: str = None,
        data_id: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
        extend_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
        self.content = content
        # 审核场景码，该接口固定输入BASE_TEXT_AUDIT，其他值无效
        self.scene = scene
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed
        # 审核时输入的额外信息
        self.extend_info = extend_info

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content is not None:
            result['content'] = self.content
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        return self


class SubmitAuditTextResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryAuditTextRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryAuditTextResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文本审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitAuditImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene: str = None,
        data_id: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
        extend_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
        # URL地址中不能包含中文，且一次请求请确保仅传入1条URL
        self.url = url
        # 审核场景码，该接口固定输入BASE_IMAGE_AUDIT，其他值无效
        self.scene = scene
        # 检测对象对应的数据ID。
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 客户业务ID。
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed
        # 审核时输入的额外信息
        self.extend_info = extend_info

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        return self


class SubmitAuditImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。
        # 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryAuditImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryAuditImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 图片审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitAuditAudioRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene: str = None,
        data_id: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
        extend_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
        # 说明 ：
        # URL地址中不能包含中文，且一次请求请确保仅传入1条URL
        self.url = url
        # 审核场景码，该接口固定输入BASE_AUDIO_AUDIT，其他值无效
        self.scene = scene
        # 检测对象对应的数据ID。
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 客户业务ID。
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed
        # 审核时输入的额外信息
        self.extend_info = extend_info

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        return self


class SubmitAuditAudioResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。
        # 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryAuditAudioRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryAuditAudioResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 音频审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitAuditVideoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene: str = None,
        data_id: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
        extend_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
        # URL地址中不能包含中文，且一次请求请确保仅传入1条URL
        self.url = url
        # 审核场景码，该接口固定输入BASE_VIDEO_AUDIT，其他值无效
        self.scene = scene
        # 检测对象对应的数据ID。
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 客户业务ID。
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed
        # 审核时输入的额外信息
        self.extend_info = extend_info

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        return self


class SubmitAuditVideoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。
        # 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryAuditVideoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryAuditVideoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class ApplyAuditTextRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: str = None,
        scene: str = None,
        data_id: str = None,
        business_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
        self.content = content
        # 审核场景码，建议BASE_TEXT_SEC代指阿里云，文本审核增强版PLUS服务的某一个Service
        self.scene = scene
        # 检测对象对应的数据ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 客户业务ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content is not None:
            result['content'] = self.content
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        return self


class ApplyAuditTextResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文本同步审核结果，字段含义见：TextSyncAuditResult
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class ApplyAuditImagebaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene: str = None,
        data_id: str = None,
        business_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 审核内容链接
        # 目前支持 jpeg、png、jpg、bmp、webp 五种格式
        # 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
        self.url = url
        # 场景，固定填写：BASE_IMAGE_SEC
        self.scene = scene
        # 数据Id，调用方入审数据的唯一Id
        self.data_id = data_id
        # 客户业务ID
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        return self


class ApplyAuditImagebaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 图片基础版审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class ApplyAuditImageadvancedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene: str = None,
        data_id: str = None,
        business_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 审核内容链接
        # 目前支持 jpeg、png、jpg、bmp、webp 五种格式
        # 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
        self.url = url
        # 场景，固定填写：ADVANCED_IMAGE_SEC
        self.scene = scene
        # 数据Id，调用方入审数据的唯一Id
        self.data_id = data_id
        # 客户业务ID
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        return self


class ApplyAuditImageadvancedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 图片增强版审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitAuditAudiobaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene: str = None,
        data_id: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
        # 说明 ：
        # 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL
        # 2. 支持音频文件格式：MP3、WAV、AAC、WMA、OGG、M4A、AMR
        self.url = url
        # 审核场景类型
        # 目前支持 BASE_AUDIO_SEC：音视频媒体通用检测
        self.scene = scene
        # 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 客户业务ID
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        return self


class SubmitAuditAudiobaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryAuditAudiobaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryAuditAudiobaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 音频通用版审核结果
        # 
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitAuditVideobaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene: str = None,
        data_id: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
        # 说明 ：
        # 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL
        # 2. 视频文件链接支持以下协议：HTTP和HTTPS。
        # 3. 视频文件支持以下格式：AVI、FLV、MP4、MPG、ASF、WMV、MOV、WMA、RMVB、RM、FLASH、TS。
        # 4. 视频大小限制：默认单个视频大小不超过500 MB。如果您的需求超过500 MB，您可以对视频进行分片处理
        self.url = url
        # 审核场景类型
        # 目前支持通用版 BASE_VIDEO_SEC
        self.scene = scene
        # 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        return self


class SubmitAuditVideobaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryAuditVideobaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryAuditVideobaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频通用版审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class CallbackAliyunAuditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        payload: str = None,
        biz_scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 回执原文
        self.payload = payload
        # 回执场景，固定填写 ALIYUN"
        self.biz_scene = biz_scene

    def validate(self):
        self.validate_required(self.payload, 'payload')
        self.validate_required(self.biz_scene, 'biz_scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.payload is not None:
            result['payload'] = self.payload
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('payload') is not None:
            self.payload = m.get('payload')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        return self


class CallbackAliyunAuditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        error_code: str = None,
        error_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 错误码
        self.error_code = error_code
        # 错误原因
        self.error_message = error_message

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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class TransferAuditFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户文件路径
        self.url = url

    def validate(self):
        self.validate_required(self.url, 'url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class TransferAuditFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应信息
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class DownloadAuditFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件地址
        self.url = url

    def validate(self):
        self.validate_required(self.url, 'url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class DownloadAuditFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应信息
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SaveAuditMeiyouRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request: List[MeiyouAuditSaveWebInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 美柚待审核信息保存请求
        self.request = request

    def validate(self):
        self.validate_required(self.request, 'request')
        if self.request:
            for k in self.request:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['request'] = []
        if self.request is not None:
            for k in self.request:
                result['request'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.request = []
        if m.get('request') is not None:
            for k in m.get('request'):
                temp_model = MeiyouAuditSaveWebInfo()
                self.request.append(temp_model.from_map(k))
        return self


class SaveAuditMeiyouResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        error_code: str = None,
        error_message: str = None,
        request_id: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 码值
        self.error_code = error_code
        # 错误信息
        self.error_message = error_message
        # 请求ID
        self.request_id = request_id
        # 响应结果
        self.result = result

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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class UpdateAuditMeiyouRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        audit_id: int = None,
        audit_result: str = None,
        audit_reason: str = None,
        audit_operator: str = None,
        audit_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 审核记录ID
        self.audit_id = audit_id
        # 审核结果
        self.audit_result = audit_result
        # 审核原因
        self.audit_reason = audit_reason
        # 操作人
        self.audit_operator = audit_operator
        # 操作时间戳(毫秒)
        self.audit_time = audit_time

    def validate(self):
        self.validate_required(self.audit_id, 'audit_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.audit_id is not None:
            result['audit_id'] = self.audit_id
        if self.audit_result is not None:
            result['audit_result'] = self.audit_result
        if self.audit_reason is not None:
            result['audit_reason'] = self.audit_reason
        if self.audit_operator is not None:
            result['audit_operator'] = self.audit_operator
        if self.audit_time is not None:
            result['audit_time'] = self.audit_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('audit_id') is not None:
            self.audit_id = m.get('audit_id')
        if m.get('audit_result') is not None:
            self.audit_result = m.get('audit_result')
        if m.get('audit_reason') is not None:
            self.audit_reason = m.get('audit_reason')
        if m.get('audit_operator') is not None:
            self.audit_operator = m.get('audit_operator')
        if m.get('audit_time') is not None:
            self.audit_time = m.get('audit_time')
        return self


class UpdateAuditMeiyouResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        error_code: str = None,
        error_message: str = None,
        request_id: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 异常码值
        self.error_code = error_code
        # 异常信息
        self.error_message = error_message
        # 请求ID
        self.request_id = request_id
        # 响应结果
        self.result = result

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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryMeiyouAuditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        audit_ids: List[int] = None,
        audit_state: str = None,
        gmt_create_start: str = None,
        gmt_create_end: str = None,
        max_num: int = None,
        source: str = None,
        audit_operators: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 审核记录ID
        self.audit_ids = audit_ids
        # 美柚itag关联状态
        self.audit_state = audit_state
        # 开始时间
        self.gmt_create_start = gmt_create_start
        # 结束时间
        self.gmt_create_end = gmt_create_end
        # 最大条数
        self.max_num = max_num
        # 数据来源
        self.source = source
        # 操作人
        self.audit_operators = audit_operators

    def validate(self):
        self.validate_required(self.audit_state, 'audit_state')
        if self.gmt_create_start is not None:
            self.validate_pattern(self.gmt_create_start, 'gmt_create_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_create_end is not None:
            self.validate_pattern(self.gmt_create_end, 'gmt_create_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.audit_ids is not None:
            result['audit_ids'] = self.audit_ids
        if self.audit_state is not None:
            result['audit_state'] = self.audit_state
        if self.gmt_create_start is not None:
            result['gmt_create_start'] = self.gmt_create_start
        if self.gmt_create_end is not None:
            result['gmt_create_end'] = self.gmt_create_end
        if self.max_num is not None:
            result['max_num'] = self.max_num
        if self.source is not None:
            result['source'] = self.source
        if self.audit_operators is not None:
            result['audit_operators'] = self.audit_operators
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('audit_ids') is not None:
            self.audit_ids = m.get('audit_ids')
        if m.get('audit_state') is not None:
            self.audit_state = m.get('audit_state')
        if m.get('gmt_create_start') is not None:
            self.gmt_create_start = m.get('gmt_create_start')
        if m.get('gmt_create_end') is not None:
            self.gmt_create_end = m.get('gmt_create_end')
        if m.get('max_num') is not None:
            self.max_num = m.get('max_num')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('audit_operators') is not None:
            self.audit_operators = m.get('audit_operators')
        return self


class QueryMeiyouAuditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应信息
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryMeiyouAudittopicRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        topic_ids: List[int] = None,
        topic_state: str = None,
        source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主题ID
        self.topic_ids = topic_ids
        # 美柚itag关联状态
        self.topic_state = topic_state
        # 数据来源
        self.source = source

    def validate(self):
        self.validate_required(self.topic_ids, 'topic_ids')
        self.validate_required(self.topic_state, 'topic_state')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.topic_ids is not None:
            result['topic_ids'] = self.topic_ids
        if self.topic_state is not None:
            result['topic_state'] = self.topic_state
        if self.source is not None:
            result['source'] = self.source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('topic_ids') is not None:
            self.topic_ids = m.get('topic_ids')
        if m.get('topic_state') is not None:
            self.topic_state = m.get('topic_state')
        if m.get('source') is not None:
            self.source = m.get('source')
        return self


class QueryMeiyouAudittopicResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口响应
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class UpdateMeiyouAuditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        topic_ids: List[int] = None,
        topic_state: str = None,
        audit_ids: List[int] = None,
        audit_state: str = None,
        itag_task_id: int = None,
        itag_dataset_id: int = None,
        source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主题ID
        self.topic_ids = topic_ids
        # 美柚itag关联状态
        self.topic_state = topic_state
        # 审核记录ID
        self.audit_ids = audit_ids
        # 美柚itag关联状态
        self.audit_state = audit_state
        # itag任务ID
        self.itag_task_id = itag_task_id
        # itag数据集ID
        self.itag_dataset_id = itag_dataset_id
        # 数据来源
        self.source = source

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.topic_ids is not None:
            result['topic_ids'] = self.topic_ids
        if self.topic_state is not None:
            result['topic_state'] = self.topic_state
        if self.audit_ids is not None:
            result['audit_ids'] = self.audit_ids
        if self.audit_state is not None:
            result['audit_state'] = self.audit_state
        if self.itag_task_id is not None:
            result['itag_task_id'] = self.itag_task_id
        if self.itag_dataset_id is not None:
            result['itag_dataset_id'] = self.itag_dataset_id
        if self.source is not None:
            result['source'] = self.source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('topic_ids') is not None:
            self.topic_ids = m.get('topic_ids')
        if m.get('topic_state') is not None:
            self.topic_state = m.get('topic_state')
        if m.get('audit_ids') is not None:
            self.audit_ids = m.get('audit_ids')
        if m.get('audit_state') is not None:
            self.audit_state = m.get('audit_state')
        if m.get('itag_task_id') is not None:
            self.itag_task_id = m.get('itag_task_id')
        if m.get('itag_dataset_id') is not None:
            self.itag_dataset_id = m.get('itag_dataset_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        return self


class UpdateMeiyouAuditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口响应
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryMeiyouItagrelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        audit_id: int = None,
        topic_id: int = None,
        itag_task_id: int = None,
        itag_dataset_id: int = None,
        itag_data_id: int = None,
        meiyou_audit_state: str = None,
        audit_state: str = None,
        topic_state: str = None,
        gmt_modified_start: str = None,
        gmt_modified_end: str = None,
        audit_operator: str = None,
        source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主键id
        self.id = id
        # 审核记录ID
        self.audit_id = audit_id
        # 主题ID
        self.topic_id = topic_id
        # itag任务ID
        self.itag_task_id = itag_task_id
        # itag数据集ID
        self.itag_dataset_id = itag_dataset_id
        # itag数据ID
        self.itag_data_id = itag_data_id
        # 美柚任务审核结果推送状态
        self.meiyou_audit_state = meiyou_audit_state
        # 审核记录状态
        self.audit_state = audit_state
        # 主题记录状态
        self.topic_state = topic_state
        # 更新时间-start
        self.gmt_modified_start = gmt_modified_start
        # 更新时间-end
        self.gmt_modified_end = gmt_modified_end
        # 操作人
        self.audit_operator = audit_operator
        # 数据来源
        self.source = source

    def validate(self):
        if self.gmt_modified_start is not None:
            self.validate_pattern(self.gmt_modified_start, 'gmt_modified_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified_end is not None:
            self.validate_pattern(self.gmt_modified_end, 'gmt_modified_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.audit_id is not None:
            result['audit_id'] = self.audit_id
        if self.topic_id is not None:
            result['topic_id'] = self.topic_id
        if self.itag_task_id is not None:
            result['itag_task_id'] = self.itag_task_id
        if self.itag_dataset_id is not None:
            result['itag_dataset_id'] = self.itag_dataset_id
        if self.itag_data_id is not None:
            result['itag_data_id'] = self.itag_data_id
        if self.meiyou_audit_state is not None:
            result['meiyou_audit_state'] = self.meiyou_audit_state
        if self.audit_state is not None:
            result['audit_state'] = self.audit_state
        if self.topic_state is not None:
            result['topic_state'] = self.topic_state
        if self.gmt_modified_start is not None:
            result['gmt_modified_start'] = self.gmt_modified_start
        if self.gmt_modified_end is not None:
            result['gmt_modified_end'] = self.gmt_modified_end
        if self.audit_operator is not None:
            result['audit_operator'] = self.audit_operator
        if self.source is not None:
            result['source'] = self.source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('audit_id') is not None:
            self.audit_id = m.get('audit_id')
        if m.get('topic_id') is not None:
            self.topic_id = m.get('topic_id')
        if m.get('itag_task_id') is not None:
            self.itag_task_id = m.get('itag_task_id')
        if m.get('itag_dataset_id') is not None:
            self.itag_dataset_id = m.get('itag_dataset_id')
        if m.get('itag_data_id') is not None:
            self.itag_data_id = m.get('itag_data_id')
        if m.get('meiyou_audit_state') is not None:
            self.meiyou_audit_state = m.get('meiyou_audit_state')
        if m.get('audit_state') is not None:
            self.audit_state = m.get('audit_state')
        if m.get('topic_state') is not None:
            self.topic_state = m.get('topic_state')
        if m.get('gmt_modified_start') is not None:
            self.gmt_modified_start = m.get('gmt_modified_start')
        if m.get('gmt_modified_end') is not None:
            self.gmt_modified_end = m.get('gmt_modified_end')
        if m.get('audit_operator') is not None:
            self.audit_operator = m.get('audit_operator')
        if m.get('source') is not None:
            self.source = m.get('source')
        return self


class QueryMeiyouItagrelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class UpdateMeiyouItagrelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        relation_info_list: List[UpdateMeiyouItagRelationWebInfo] = None,
        update_audit_flag: bool = None,
        source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 更新关系信息
        self.relation_info_list = relation_info_list
        # 是否更新审核记录信息
        self.update_audit_flag = update_audit_flag
        # 数据来源
        self.source = source

    def validate(self):
        if self.relation_info_list:
            for k in self.relation_info_list:
                if k:
                    k.validate()
        self.validate_required(self.update_audit_flag, 'update_audit_flag')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['relation_info_list'] = []
        if self.relation_info_list is not None:
            for k in self.relation_info_list:
                result['relation_info_list'].append(k.to_map() if k else None)
        if self.update_audit_flag is not None:
            result['update_audit_flag'] = self.update_audit_flag
        if self.source is not None:
            result['source'] = self.source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.relation_info_list = []
        if m.get('relation_info_list') is not None:
            for k in m.get('relation_info_list'):
                temp_model = UpdateMeiyouItagRelationWebInfo()
                self.relation_info_list.append(temp_model.from_map(k))
        if m.get('update_audit_flag') is not None:
            self.update_audit_flag = m.get('update_audit_flag')
        if m.get('source') is not None:
            self.source = m.get('source')
        return self


class UpdateMeiyouItagrelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryMeiyouAuditresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        audit_ids: List[int] = None,
        meiyou_audit_state: str = None,
        audit_state: List[str] = None,
        topic_state: str = None,
        create_start: str = None,
        create_end: str = None,
        source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 审核ID
        self.audit_ids = audit_ids
        # 美柚任务审核结果推送状态
        self.meiyou_audit_state = meiyou_audit_state
        # 审核记录状态
        self.audit_state = audit_state
        # 主题记录状态
        self.topic_state = topic_state
        # 开始时间点
        self.create_start = create_start
        # 结束时间点
        self.create_end = create_end
        # 数据来源
        self.source = source

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.audit_ids is not None:
            result['audit_ids'] = self.audit_ids
        if self.meiyou_audit_state is not None:
            result['meiyou_audit_state'] = self.meiyou_audit_state
        if self.audit_state is not None:
            result['audit_state'] = self.audit_state
        if self.topic_state is not None:
            result['topic_state'] = self.topic_state
        if self.create_start is not None:
            result['create_start'] = self.create_start
        if self.create_end is not None:
            result['create_end'] = self.create_end
        if self.source is not None:
            result['source'] = self.source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('audit_ids') is not None:
            self.audit_ids = m.get('audit_ids')
        if m.get('meiyou_audit_state') is not None:
            self.meiyou_audit_state = m.get('meiyou_audit_state')
        if m.get('audit_state') is not None:
            self.audit_state = m.get('audit_state')
        if m.get('topic_state') is not None:
            self.topic_state = m.get('topic_state')
        if m.get('create_start') is not None:
            self.create_start = m.get('create_start')
        if m.get('create_end') is not None:
            self.create_end = m.get('create_end')
        if m.get('source') is not None:
            self.source = m.get('source')
        return self


class QueryMeiyouAuditresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应信息
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class PagequeryMeiyouAuditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        page_num: int = None,
        audit_id: int = None,
        page_size: int = None,
        topic_id: int = None,
        content: str = None,
        primary_business: str = None,
        secondary_business: str = None,
        audit_result: str = None,
        audit_reason: str = None,
        gmt_create_start: str = None,
        gmt_create_end: str = None,
        source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主键id
        self.id = id
        # 页面
        self.page_num = page_num
        # 审核记录ID
        self.audit_id = audit_id
        # 大小
        self.page_size = page_size
        # 主题ID
        self.topic_id = topic_id
        # 内容文本
        self.content = content
        # 一级业务
        self.primary_business = primary_business
        # 二级业务
        self.secondary_business = secondary_business
        # 审核结果
        self.audit_result = audit_result
        # 审核原因
        self.audit_reason = audit_reason
        # 创建时间-start
        self.gmt_create_start = gmt_create_start
        # 创建时间-end
        self.gmt_create_end = gmt_create_end
        # 数据来源
        self.source = source

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
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
        if self.id is not None:
            result['id'] = self.id
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.audit_id is not None:
            result['audit_id'] = self.audit_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.topic_id is not None:
            result['topic_id'] = self.topic_id
        if self.content is not None:
            result['content'] = self.content
        if self.primary_business is not None:
            result['primary_business'] = self.primary_business
        if self.secondary_business is not None:
            result['secondary_business'] = self.secondary_business
        if self.audit_result is not None:
            result['audit_result'] = self.audit_result
        if self.audit_reason is not None:
            result['audit_reason'] = self.audit_reason
        if self.gmt_create_start is not None:
            result['gmt_create_start'] = self.gmt_create_start
        if self.gmt_create_end is not None:
            result['gmt_create_end'] = self.gmt_create_end
        if self.source is not None:
            result['source'] = self.source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('audit_id') is not None:
            self.audit_id = m.get('audit_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('topic_id') is not None:
            self.topic_id = m.get('topic_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('primary_business') is not None:
            self.primary_business = m.get('primary_business')
        if m.get('secondary_business') is not None:
            self.secondary_business = m.get('secondary_business')
        if m.get('audit_result') is not None:
            self.audit_result = m.get('audit_result')
        if m.get('audit_reason') is not None:
            self.audit_reason = m.get('audit_reason')
        if m.get('gmt_create_start') is not None:
            self.gmt_create_start = m.get('gmt_create_start')
        if m.get('gmt_create_end') is not None:
            self.gmt_create_end = m.get('gmt_create_end')
        if m.get('source') is not None:
            self.source = m.get('source')
        return self


class PagequeryMeiyouAuditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应信息
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitAuditMeiyouRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        source: str = None,
        save_info: List[MeiyouAuditSaveWebRequest] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据来源
        self.source = source
        # 美柚审核信息存储请求
        self.save_info = save_info

    def validate(self):
        self.validate_required(self.source, 'source')
        if self.save_info:
            for k in self.save_info:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.source is not None:
            result['source'] = self.source
        result['save_info'] = []
        if self.save_info is not None:
            for k in self.save_info:
                result['save_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        self.save_info = []
        if m.get('save_info') is not None:
            for k in m.get('save_info'):
                temp_model = MeiyouAuditSaveWebRequest()
                self.save_info.append(temp_model.from_map(k))
        return self


class SubmitAuditMeiyouResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitAuditDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene: str = None,
        data_id: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
        extend_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 URL地址中不能包含中文，且一次请求请确保仅传入1条URL
        self.url = url
        # 审核场景码
        self.scene = scene
        # 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed
        # 审核时输入的额外信息
        self.extend_info = extend_info

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        return self


class SubmitAuditDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryAuditDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryAuditDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文档审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryAicoguardcloudAdbsinkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        region_id: str = None,
        db_instance_id: str = None,
        name_space: str = None,
        name_space_password: str = None,
        collection_name: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区域id
        self.region_id = region_id
        # DB实例id
        self.db_instance_id = db_instance_id
        # 数据库空间名称
        self.name_space = name_space
        # 数据库空间密码
        self.name_space_password = name_space_password
        # 数据库表名
        self.collection_name = collection_name
        # 查询的内容
        self.content = content

    def validate(self):
        self.validate_required(self.region_id, 'region_id')
        self.validate_required(self.db_instance_id, 'db_instance_id')
        self.validate_required(self.name_space, 'name_space')
        self.validate_required(self.name_space_password, 'name_space_password')
        self.validate_required(self.collection_name, 'collection_name')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.db_instance_id is not None:
            result['db_instance_id'] = self.db_instance_id
        if self.name_space is not None:
            result['name_space'] = self.name_space
        if self.name_space_password is not None:
            result['name_space_password'] = self.name_space_password
        if self.collection_name is not None:
            result['collection_name'] = self.collection_name
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('db_instance_id') is not None:
            self.db_instance_id = m.get('db_instance_id')
        if m.get('name_space') is not None:
            self.name_space = m.get('name_space')
        if m.get('name_space_password') is not None:
            self.name_space_password = m.get('name_space_password')
        if m.get('collection_name') is not None:
            self.collection_name = m.get('collection_name')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class QueryAicoguardcloudAdbsinkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        question: str = None,
        answer: str = None,
        score: str = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求的问题
        self.question = question
        # 代答结果
        self.answer = answer
        # 匹配度分数
        self.score = score
        # adb的请求id
        self.request_id = request_id

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
        if self.question is not None:
            result['question'] = self.question
        if self.answer is not None:
            result['answer'] = self.answer
        if self.score is not None:
            result['score'] = self.score
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('answer') is not None:
            self.answer = m.get('answer')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryGuardcoreRedgptRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        session_id: str = None,
        scene_code: str = None,
        app_code: str = None,
        question: str = None,
        question_format: str = None,
        user_id: str = None,
        stream: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 唯一请求ID
        self.request_id = request_id
        # 多轮对话会话ID
        self.session_id = session_id
        # 场景code
        self.scene_code = scene_code
        # 调用方AppCode
        self.app_code = app_code
        # 提问内容
        self.question = question
        # 提问内容格式,当前仅支持PLAINTEXT
        self.question_format = question_format
        # 加密的调用方业务UserId
        self.user_id = user_id
        # 是否流式输出
        self.stream = stream

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.app_code, 'app_code')
        self.validate_required(self.question, 'question')
        self.validate_required(self.question_format, 'question_format')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.stream, 'stream')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.question is not None:
            result['question'] = self.question
        if self.question_format is not None:
            result['question_format'] = self.question_format
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.stream is not None:
            result['stream'] = self.stream
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('question_format') is not None:
            self.question_format = m.get('question_format')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('stream') is not None:
            self.stream = m.get('stream')
        return self


class QueryGuardcoreRedgptResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: MayaStreamResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # maya流式调用结果集
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
        if m.get('data') is not None:
            temp_model = MayaStreamResult()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryAicoguardAdbsinkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        region_id: str = None,
        db_instance_id: str = None,
        name_space: str = None,
        name_space_password: str = None,
        collection_name: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区域id
        self.region_id = region_id
        # DB实例id
        self.db_instance_id = db_instance_id
        # 数据库空间名称
        self.name_space = name_space
        # 数据库空间密码
        self.name_space_password = name_space_password
        # 数据库表名
        self.collection_name = collection_name
        # 要查询的内容
        self.content = content

    def validate(self):
        self.validate_required(self.region_id, 'region_id')
        self.validate_required(self.db_instance_id, 'db_instance_id')
        self.validate_required(self.name_space, 'name_space')
        self.validate_required(self.name_space_password, 'name_space_password')
        self.validate_required(self.collection_name, 'collection_name')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.db_instance_id is not None:
            result['db_instance_id'] = self.db_instance_id
        if self.name_space is not None:
            result['name_space'] = self.name_space
        if self.name_space_password is not None:
            result['name_space_password'] = self.name_space_password
        if self.collection_name is not None:
            result['collection_name'] = self.collection_name
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('db_instance_id') is not None:
            self.db_instance_id = m.get('db_instance_id')
        if m.get('name_space') is not None:
            self.name_space = m.get('name_space')
        if m.get('name_space_password') is not None:
            self.name_space_password = m.get('name_space_password')
        if m.get('collection_name') is not None:
            self.collection_name = m.get('collection_name')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class QueryAicoguardAdbsinkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        question: str = None,
        answer: str = None,
        score: str = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求的问题
        self.question = question
        # 代答结果
        self.answer = answer
        # 匹配度分数
        self.score = score
        # adb的请求id
        self.request_id = request_id

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
        if self.question is not None:
            result['question'] = self.question
        if self.answer is not None:
            result['answer'] = self.answer
        if self.score is not None:
            result['score'] = self.score
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('answer') is not None:
            self.answer = m.get('answer')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class CallbackGuardAliyunRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        payload: str = None,
        biz_scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 回执原文
        self.payload = payload
        # 回执场景，固定填写 ALIYUN"
        self.biz_scene = biz_scene

    def validate(self):
        self.validate_required(self.payload, 'payload')
        self.validate_required(self.biz_scene, 'biz_scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.payload is not None:
            result['payload'] = self.payload
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('payload') is not None:
            self.payload = m.get('payload')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        return self


class CallbackGuardAliyunResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        error_code: str = None,
        error_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 错误码
        self.error_code = error_code
        # 错误原因
        self.error_message = error_message

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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class CallbackGuardItaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        payload: str = None,
        biz_scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 回执原文
        self.payload = payload
        # 回执场景
        self.biz_scene = biz_scene

    def validate(self):
        self.validate_required(self.payload, 'payload')
        self.validate_required(self.biz_scene, 'biz_scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.payload is not None:
            result['payload'] = self.payload
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('payload') is not None:
            self.payload = m.get('payload')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        return self


class CallbackGuardItaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        error_code: str = None,
        error_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 错误码
        self.error_code = error_code
        # 错误原因
        self.error_message = error_message

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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class QueryGuardAudioRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryGuardAudioResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 音频审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitGuardAudioRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene_code: str = None,
        data_id: str = None,
        app_code: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 说明 ： URL地址中不能包含中文，且一次请求请确保仅传入1条URL
        self.url = url
        # 审核场景码，该接口固定输入BASE_AUDIO_AUDIT，其他值无效
        self.scene_code = scene_code
        # 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 用于上游标识应用来源，字符串长度不能超过 128
        self.app_code = app_code
        # 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        return self


class SubmitGuardAudioResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryGuardImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryGuardImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 图片审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitGuardImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene_code: str = None,
        data_id: str = None,
        app_code: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 URL地址中不能包含中文，且一次请求请确保仅传入1条URL
        self.url = url
        # 审核场景码，该接口固定输入BASE_IMAGE_AUDIT，其他值无效
        self.scene_code = scene_code
        # 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 标识上游应用来源，字符串长度不能超过 128
        self.app_code = app_code
        # 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        return self


class SubmitGuardImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryGuardTextRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryGuardTextResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文本审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitGuardTextRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: str = None,
        scene_code: str = None,
        data_id: str = None,
        app_code: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
        self.content = content
        # 审核场景码，固定输入BASE_TEXT_AUDIT，其他值无效
        self.scene_code = scene_code
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 标识上游应用来源，字符串长度不能超过 128
        self.app_code = app_code
        # 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content is not None:
            result['content'] = self.content
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        return self


class SubmitGuardTextResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryGuardVideoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryGuardVideoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitGuardVideoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene_code: str = None,
        data_id: str = None,
        app_code: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 URL地址中不能包含中文，且一次请求请确保仅传入1条URL
        self.url = url
        # 审核场景码，该接口固定输入BASE_VIDEO_AUDIT，其他值无效
        self.scene_code = scene_code
        # 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 标识上游应用来源，字符串长度不能超过 128
        self.app_code = app_code
        # 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        return self


class SubmitGuardVideoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryGuardAudiobaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryGuardAudiobaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 音频机审结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitGuardAudiobaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene_code: str = None,
        data_id: str = None,
        app_code: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 说明 ： 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL 2. 支持音频文件格式：MP3、WAV、AAC、WMA、OGG、M4A、AMR
        self.url = url
        # 审核场景类型 目前支持 BASE_AUDIO_SEC：音视频媒体通用检测
        self.scene_code = scene_code
        # 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 标识上游应用来源，字符串长度不能超过 128
        self.app_code = app_code
        # 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        return self


class SubmitGuardAudiobaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class ApplyGuardImagebaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene_code: str = None,
        data_id: str = None,
        app_code: str = None,
        business_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 审核内容链接 目前支持 jpeg、png、jpg、bmp、webp 五种格式 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
        self.url = url
        # 场景，固定填写：BASE_IMAGE_SEC
        self.scene_code = scene_code
        # 数据Id，调用方入审数据的唯一Id
        self.data_id = data_id
        # 标识上游应用来源，字符串长度不能超过 128
        self.app_code = app_code
        # 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        return self


class ApplyGuardImagebaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 图片机审结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class ApplyGuardImageadvancedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene_code: str = None,
        data_id: str = None,
        app_code: str = None,
        business_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 审核内容链接 目前支持 jpeg、png、jpg、bmp、webp 五种格式 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
        self.url = url
        # 场景，固定填写：ADVANCED_IMAGE_SEC
        self.scene_code = scene_code
        # 数据Id，调用方入审数据的唯一Id
        self.data_id = data_id
        # 标识上游应用来源，字符串长度不能超过 128
        self.app_code = app_code
        # 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        return self


class ApplyGuardImageadvancedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 图片审核增强版结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class ApplyGuardTextbaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: str = None,
        scene_code: str = None,
        data_id: str = None,
        app_code: str = None,
        business_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
        self.content = content
        # 审核场景码，建议BASE_TEXT_SEC代指阿里云，文本审核增强版PLUS服务的某一个Service
        self.scene_code = scene_code
        # 检测对象对应的数据ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 
        # 标识上游应用来源，字符串长度不能超过 128
        self.app_code = app_code
        # 客户业务ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content is not None:
            result['content'] = self.content
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        return self


class ApplyGuardTextbaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文本同步审核结果，字段含义见：TextSyncAuditResult
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryGuardVideobaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryGuardVideobaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频机审结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitGuardVideobaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene_code: str = None,
        data_id: str = None,
        app_code: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 说明 ： 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL 2. 视频文件链接支持以下协议：HTTP和HTTPS。 3. 视频文件支持以下格式：AVI、FLV、MP4、MPG、ASF、WMV、MOV、WMA、RMVB、RM、FLASH、TS。 4. 视频大小限制：默认单个视频大小不超过500 MB。如果您的需求超过500 MB，您可以对视频进行分片处理
        self.url = url
        # 审核场景类型 目前支持通用版 BASE_VIDEO_SEC
        self.scene_code = scene_code
        # 划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 标识上游应用来源，字符串长度不能超过 128
        self.app_code = app_code
        # 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        return self


class SubmitGuardVideobaseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class ApplyGuardImagemultiplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_code: str = None,
        data_id: str = None,
        url: str = None,
        app_code: str = None,
        business_id: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景，固定填写：SCENE_MULTIPLY_IMAGE_SEC
        self.scene_code = scene_code
        # 数据Id，调用方入审数据的唯一Id
        self.data_id = data_id
        # 鉴定图片内容链接，url 和 content 参数二选一
        self.url = url
        # 标识上游应用来源，字符串长度不能超过 128
        self.app_code = app_code
        # 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线...
        self.business_id = business_id
        # 鉴定图片 base64 地址，url 和 content 参数二选一
        self.content = content

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.url is not None:
            result['url'] = self.url
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class ApplyGuardImagemultiplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 光鉴检测结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class CheckGuardAnswerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_code: str = None,
        business_id: str = None,
        content: str = None,
        scene_code: str = None,
        flow_detect: str = None,
        session_id: str = None,
        reply_proxy: str = None,
        privacy_data_obfuscation: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用方标识
        self.app_code = app_code
        # 细分调用方标识，可与 appCode 传相同值
        self.business_id = business_id
        # 文本内容，最大5000字符长度
        self.content = content
        # 场景code：
        # ● llm_output_detection：大模型输出通用场景
        self.scene_code = scene_code
        # 是否开启流式检测功能。默认值：N：不开启
        # Y：开启
        # N：不开启
        self.flow_detect = flow_detect
        # 会话ID，标记本次请求内容属于同一段流式内容，文本审核引擎会自动拼接后进行审核，拼接文字片段后不超过10000字的部分
        self.session_id = session_id
        # 是否要针对大模型输出的CoT、回答进行代答/改写。默认值：N：不开启
        # Y：开启
        # N：不开启
        self.reply_proxy = reply_proxy
        # 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启
        # Y：开启
        # N：不开启
        self.privacy_data_obfuscation = privacy_data_obfuscation

    def validate(self):
        self.validate_required(self.app_code, 'app_code')
        self.validate_required(self.content, 'content')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.content is not None:
            result['content'] = self.content
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.flow_detect is not None:
            result['flow_detect'] = self.flow_detect
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.reply_proxy is not None:
            result['reply_proxy'] = self.reply_proxy
        if self.privacy_data_obfuscation is not None:
            result['privacy_data_obfuscation'] = self.privacy_data_obfuscation
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('flow_detect') is not None:
            self.flow_detect = m.get('flow_detect')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('reply_proxy') is not None:
            self.reply_proxy = m.get('reply_proxy')
        if m.get('privacy_data_obfuscation') is not None:
            self.privacy_data_obfuscation = m.get('privacy_data_obfuscation')
        return self


class CheckGuardAnswerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文本审核结果。返回结果中包含一个需自行转换的Json字符串
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SubmitMeiyouAuditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_id: str = None,
        modal: str = None,
        scene_code: str = None,
        ext_info: str = None,
        audit_info: str = None,
        callback: str = None,
        tenant_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据Id
        self.data_id = data_id
        # 模态
        self.modal = modal
        # 场景
        self.scene_code = scene_code
        # 扩展信息
        self.ext_info = ext_info
        # 美柚审核记录信息
        self.audit_info = audit_info
        # 回调函数
        self.callback = callback
        # 租户
        self.tenant_code = tenant_code

    def validate(self):
        self.validate_required(self.data_id, 'data_id')
        self.validate_required(self.modal, 'modal')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.audit_info, 'audit_info')
        self.validate_required(self.callback, 'callback')
        self.validate_required(self.tenant_code, 'tenant_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.modal is not None:
            result['modal'] = self.modal
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.audit_info is not None:
            result['audit_info'] = self.audit_info
        if self.callback is not None:
            result['callback'] = self.callback
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('modal') is not None:
            self.modal = m.get('modal')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('audit_info') is not None:
            self.audit_info = m.get('audit_info')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        return self


class SubmitMeiyouAuditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
        error_code: str = None,
        error_message: str = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应结果
        self.result = result
        # 码值
        self.error_code = error_code
        # 错误信息
        self.error_message = error_message
        # 请求ID
        self.request_id = request_id

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
        if self.result is not None:
            result['result'] = self.result
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryMeiyouAgentauditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        gmt_create_start: str = None,
        gmt_create_end: str = None,
        owner: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据创建时间-开始时间点
        self.gmt_create_start = gmt_create_start
        # 数据创建时间-结束时间点
        self.gmt_create_end = gmt_create_end
        # 所属
        self.owner = owner

    def validate(self):
        self.validate_required(self.gmt_create_start, 'gmt_create_start')
        if self.gmt_create_start is not None:
            self.validate_pattern(self.gmt_create_start, 'gmt_create_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_create_end, 'gmt_create_end')
        if self.gmt_create_end is not None:
            self.validate_pattern(self.gmt_create_end, 'gmt_create_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.gmt_create_start is not None:
            result['gmt_create_start'] = self.gmt_create_start
        if self.gmt_create_end is not None:
            result['gmt_create_end'] = self.gmt_create_end
        if self.owner is not None:
            result['owner'] = self.owner
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('gmt_create_start') is not None:
            self.gmt_create_start = m.get('gmt_create_start')
        if m.get('gmt_create_end') is not None:
            self.gmt_create_end = m.get('gmt_create_end')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        return self


class QueryMeiyouAgentauditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
        error_code: str = None,
        error_message: str = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应结果
        self.result = result
        # 码值
        self.error_code = error_code
        # 错误信息
        self.error_message = error_message
        # 请求ID
        self.request_id = request_id

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
        if self.result is not None:
            result['result'] = self.result
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class UpdateAicoguardcoreMeiyouRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        result_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 更新信息
        self.result_info = result_info

    def validate(self):
        self.validate_required(self.result_info, 'result_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.result_info is not None:
            result['result_info'] = self.result_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('result_info') is not None:
            self.result_info = m.get('result_info')
        return self


class UpdateAicoguardcoreMeiyouResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        error_code: str = None,
        error_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应码值
        self.error_code = error_code
        # 响应描述
        self.error_message = error_message

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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class SubmitGuardDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        scene_code: str = None,
        data_id: str = None,
        app_code: str = None,
        business_id: str = None,
        callback: str = None,
        seed: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
        # 说明 ：
        # URL地址中不能包含中文，且一次请求请确保仅传入1条URL
        self.url = url
        # 审核场景码
        self.scene_code = scene_code
        # 检测对象对应的数据ID。
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.data_id = data_id
        # 标识上游应用来源，字符串长度不能超过 128
        self.app_code = app_code
        # 客户业务ID。
        # 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        self.business_id = business_id
        # 结果通知地址，不指定时需要调用方主动查询结果
        self.callback = callback
        # 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        self.seed = seed

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.callback is not None:
            result['callback'] = self.callback
        if self.seed is not None:
            result['seed'] = self.seed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        if m.get('seed') is not None:
            self.seed = m.get('seed')
        return self


class SubmitGuardDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 检测对象对应的数据ID。
        # 说明：
        # 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
        self.data_id = data_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryGuardDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryGuardDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文档审核结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QuerySecurityQuestionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise: str = None,
        question: str = None,
        business_id: str = None,
        scene_code: str = None,
        message_id: str = None,
        session_id: str = None,
        multi_session_detect: str = None,
        prompt_reword: str = None,
        finance_compliance_detection: str = None,
        field_identify: str = None,
        prompt_attack_defense: str = None,
        privacy_data_detection: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用方唯一标示
        self.enterprise = enterprise
        # 提问内容
        self.question = question
        # 调用方标示
        self.business_id = business_id
        # 场景code
        self.scene_code = scene_code
        # 标示是否是同一个Q&A
        self.message_id = message_id
        # 会话ID
        self.session_id = session_id
        # 是否开启流式检测功能。默认值：N：不开启，Y：开启
        self.multi_session_detect = multi_session_detect
        # 是否开启针对大模型输入文本的的安全改写和增强功能。默认值：N：不开启，Y：开启
        self.prompt_reword = prompt_reword
        # 是否需要针对提问内容的进行金融合规检测。默认值：N：不开启，Y：开启
        self.finance_compliance_detection = finance_compliance_detection
        # 是否需要针对提问内容的进行领域识别
        self.field_identify = field_identify
        # 是否开启提示词攻击防御功能
        self.prompt_attack_defense = prompt_attack_defense
        # 是否开启隐私数据泄露的专项检测
        self.privacy_data_detection = privacy_data_detection

    def validate(self):
        self.validate_required(self.question, 'question')
        if self.question is not None:
            self.validate_max_length(self.question, 'question', 10000)
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.enterprise is not None:
            result['enterprise'] = self.enterprise
        if self.question is not None:
            result['question'] = self.question
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.multi_session_detect is not None:
            result['multi_session_detect'] = self.multi_session_detect
        if self.prompt_reword is not None:
            result['prompt_reword'] = self.prompt_reword
        if self.finance_compliance_detection is not None:
            result['finance_compliance_detection'] = self.finance_compliance_detection
        if self.field_identify is not None:
            result['field_identify'] = self.field_identify
        if self.prompt_attack_defense is not None:
            result['prompt_attack_defense'] = self.prompt_attack_defense
        if self.privacy_data_detection is not None:
            result['privacy_data_detection'] = self.privacy_data_detection
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise') is not None:
            self.enterprise = m.get('enterprise')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('multi_session_detect') is not None:
            self.multi_session_detect = m.get('multi_session_detect')
        if m.get('prompt_reword') is not None:
            self.prompt_reword = m.get('prompt_reword')
        if m.get('finance_compliance_detection') is not None:
            self.finance_compliance_detection = m.get('finance_compliance_detection')
        if m.get('field_identify') is not None:
            self.field_identify = m.get('field_identify')
        if m.get('prompt_attack_defense') is not None:
            self.prompt_attack_defense = m.get('prompt_attack_defense')
        if m.get('privacy_data_detection') is not None:
            self.privacy_data_detection = m.get('privacy_data_detection')
        return self


class QuerySecurityQuestionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        action_code: str = None,
        customize_risk_word: List[str] = None,
        labels: List[LabelModel] = None,
        session_id: str = None,
        message_id: str = None,
        limit_answer: str = None,
        security_answer: str = None,
        security_prompt: str = None,
        attack_labels: AttackLabel = None,
        field_info: FieldModel = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 代表风险等级和建议的处置结论，PASS：安全无风险，BLOCK：绝对风险，建议直接拦截，SECURITY_ANSWER：泛风险，回答内容存在敏感要素
        self.action_code = action_code
        # 命中的自定义黑词列表
        self.customize_risk_word = customize_risk_word
        # 风险标签
        self.labels = labels
        # 会话Id
        self.session_id = session_id
        # 表示是同一个Q&A
        self.message_id = message_id
        # 兜底话术
        self.limit_answer = limit_answer
        # 有风险时的安全代答
        self.security_answer = security_answer
        # 当请求参数 promptReword=Y 时返回，为安全改写后的内容
        self.security_prompt = security_prompt
        # 提示词攻击手法标签
        self.attack_labels = attack_labels
        # 领域标签信息
        self.field_info = field_info

    def validate(self):
        if self.labels:
            for k in self.labels:
                if k:
                    k.validate()
        if self.attack_labels:
            self.attack_labels.validate()
        if self.field_info:
            self.field_info.validate()

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
        if self.action_code is not None:
            result['action_code'] = self.action_code
        if self.customize_risk_word is not None:
            result['customize_risk_word'] = self.customize_risk_word
        result['labels'] = []
        if self.labels is not None:
            for k in self.labels:
                result['labels'].append(k.to_map() if k else None)
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.limit_answer is not None:
            result['limit_answer'] = self.limit_answer
        if self.security_answer is not None:
            result['security_answer'] = self.security_answer
        if self.security_prompt is not None:
            result['security_prompt'] = self.security_prompt
        if self.attack_labels is not None:
            result['attack_labels'] = self.attack_labels.to_map()
        if self.field_info is not None:
            result['field_info'] = self.field_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('action_code') is not None:
            self.action_code = m.get('action_code')
        if m.get('customize_risk_word') is not None:
            self.customize_risk_word = m.get('customize_risk_word')
        self.labels = []
        if m.get('labels') is not None:
            for k in m.get('labels'):
                temp_model = LabelModel()
                self.labels.append(temp_model.from_map(k))
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('limit_answer') is not None:
            self.limit_answer = m.get('limit_answer')
        if m.get('security_answer') is not None:
            self.security_answer = m.get('security_answer')
        if m.get('security_prompt') is not None:
            self.security_prompt = m.get('security_prompt')
        if m.get('attack_labels') is not None:
            temp_model = AttackLabel()
            self.attack_labels = temp_model.from_map(m['attack_labels'])
        if m.get('field_info') is not None:
            temp_model = FieldModel()
            self.field_info = temp_model.from_map(m['field_info'])
        return self


class QuerySecurityAnswerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise: str = None,
        business_id: str = None,
        content: str = None,
        scene_code: str = None,
        flow_detect: str = None,
        flow_msg_id: str = None,
        flow_end: str = None,
        message_id: str = None,
        privacy_data_obfuscation: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用标示
        self.enterprise = enterprise
        # 细分调用方标识
        self.business_id = business_id
        # 当前回答内容，最大长度40000个字符
        self.content = content
        # 场景code
        self.scene_code = scene_code
        # 是否开启流式检测功能。默认值：N：不开启，Y：开启
        self.flow_detect = flow_detect
        # 会话id
        self.flow_msg_id = flow_msg_id
        # 流失内容结束标示
        self.flow_end = flow_end
        # 表示是同一个Q&A
        self.message_id = message_id
        # 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启，Y：开启
        self.privacy_data_obfuscation = privacy_data_obfuscation

    def validate(self):
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.content, 'content')
        if self.content is not None:
            self.validate_max_length(self.content, 'content', 40000)
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.enterprise is not None:
            result['enterprise'] = self.enterprise
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.content is not None:
            result['content'] = self.content
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.flow_detect is not None:
            result['flow_detect'] = self.flow_detect
        if self.flow_msg_id is not None:
            result['flow_msg_id'] = self.flow_msg_id
        if self.flow_end is not None:
            result['flow_end'] = self.flow_end
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.privacy_data_obfuscation is not None:
            result['privacy_data_obfuscation'] = self.privacy_data_obfuscation
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise') is not None:
            self.enterprise = m.get('enterprise')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('flow_detect') is not None:
            self.flow_detect = m.get('flow_detect')
        if m.get('flow_msg_id') is not None:
            self.flow_msg_id = m.get('flow_msg_id')
        if m.get('flow_end') is not None:
            self.flow_end = m.get('flow_end')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('privacy_data_obfuscation') is not None:
            self.privacy_data_obfuscation = m.get('privacy_data_obfuscation')
        return self


class QuerySecurityAnswerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        action_code: str = None,
        labels: List[LabelModel] = None,
        customize_risk_word: List[str] = None,
        flow_process_state: str = None,
        flow_msg_id: str = None,
        message_id: str = None,
        security_answer: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 代表风险等级和建议的处置结论，PASS：安全无风险，BLOCK：绝对风险，建议直接拦截，SECURITY_ANSWER：泛风险，回答内容存在敏感要素
        self.action_code = action_code
        # 风险标签
        self.labels = labels
        # 命中的自定义黑词列表
        self.customize_risk_word = customize_risk_word
        # 针对流式输入的处理状态，针对流式输入的处理状态，当请求参数 flowDetect=Y 时返回，结果信息如下：
        # 1. processing：等待处理中，暂无风险检测结果，可能是输入的文本信息不足一句
        # 2. done：处理完成，请参考actionCode及对应的风险标签信息
        self.flow_process_state = flow_process_state
        # 流式内容ID
        self.flow_msg_id = flow_msg_id
        # 表示是同一个Q&A
        self.message_id = message_id
        # 兜底话术
        self.security_answer = security_answer

    def validate(self):
        if self.labels:
            for k in self.labels:
                if k:
                    k.validate()

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
        if self.action_code is not None:
            result['action_code'] = self.action_code
        result['labels'] = []
        if self.labels is not None:
            for k in self.labels:
                result['labels'].append(k.to_map() if k else None)
        if self.customize_risk_word is not None:
            result['customize_risk_word'] = self.customize_risk_word
        if self.flow_process_state is not None:
            result['flow_process_state'] = self.flow_process_state
        if self.flow_msg_id is not None:
            result['flow_msg_id'] = self.flow_msg_id
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.security_answer is not None:
            result['security_answer'] = self.security_answer
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('action_code') is not None:
            self.action_code = m.get('action_code')
        self.labels = []
        if m.get('labels') is not None:
            for k in m.get('labels'):
                temp_model = LabelModel()
                self.labels.append(temp_model.from_map(k))
        if m.get('customize_risk_word') is not None:
            self.customize_risk_word = m.get('customize_risk_word')
        if m.get('flow_process_state') is not None:
            self.flow_process_state = m.get('flow_process_state')
        if m.get('flow_msg_id') is not None:
            self.flow_msg_id = m.get('flow_msg_id')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('security_answer') is not None:
            self.security_answer = m.get('security_answer')
        return self


