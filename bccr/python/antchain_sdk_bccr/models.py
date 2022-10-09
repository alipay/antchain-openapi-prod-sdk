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


class ScreenshotInfo(TeaModel):
    def __init__(
        self,
        process_log_file: str = None,
        process_log_file_hash: str = None,
        check_log_file: str = None,
        check_log_file_hash: str = None,
        screenshot_file: str = None,
        screenshot_file_hash: str = None,
    ):
        # 全链路取证日志文件下载链接
        self.process_log_file = process_log_file
        # 全链路取证日志文件哈希
        self.process_log_file_hash = process_log_file_hash
        # 自清洁文件下载链接
        self.check_log_file = check_log_file
        # 自清洁文件哈希
        self.check_log_file_hash = check_log_file_hash
        # 网页截图文件下载链接
        self.screenshot_file = screenshot_file
        # 网页截图文件哈希
        self.screenshot_file_hash = screenshot_file_hash

    def validate(self):
        self.validate_required(self.screenshot_file, 'screenshot_file')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.process_log_file is not None:
            result['process_log_file'] = self.process_log_file
        if self.process_log_file_hash is not None:
            result['process_log_file_hash'] = self.process_log_file_hash
        if self.check_log_file is not None:
            result['check_log_file'] = self.check_log_file
        if self.check_log_file_hash is not None:
            result['check_log_file_hash'] = self.check_log_file_hash
        if self.screenshot_file is not None:
            result['screenshot_file'] = self.screenshot_file
        if self.screenshot_file_hash is not None:
            result['screenshot_file_hash'] = self.screenshot_file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('process_log_file') is not None:
            self.process_log_file = m.get('process_log_file')
        if m.get('process_log_file_hash') is not None:
            self.process_log_file_hash = m.get('process_log_file_hash')
        if m.get('check_log_file') is not None:
            self.check_log_file = m.get('check_log_file')
        if m.get('check_log_file_hash') is not None:
            self.check_log_file_hash = m.get('check_log_file_hash')
        if m.get('screenshot_file') is not None:
            self.screenshot_file = m.get('screenshot_file')
        if m.get('screenshot_file_hash') is not None:
            self.screenshot_file_hash = m.get('screenshot_file_hash')
        return self


class ScreenInfo(TeaModel):
    def __init__(
        self,
        process_log_file: str = None,
        process_log_file_hash: str = None,
        check_log_file: str = None,
        check_log_file_hash: str = None,
        web_screenshot_file: str = None,
        web_screenshot_file_hash: str = None,
        web_source_file: str = None,
        web_source_file_hash: str = None,
        video_file: str = None,
        video_file_hash: str = None,
        extend_device_check_file: str = None,
        extend_device_check_file_hash: str = None,
        extend_device_process_file: str = None,
        extend_device_process_file_hash: str = None,
    ):
        # 全链路取证日志文件下载链接
        self.process_log_file = process_log_file
        # 全链路取证日志文件哈希
        self.process_log_file_hash = process_log_file_hash
        # 自清洁文件下载地址
        self.check_log_file = check_log_file
        # 自清洁文件哈希
        self.check_log_file_hash = check_log_file_hash
        # 网页截图文件下载链接
        self.web_screenshot_file = web_screenshot_file
        # 网页截图文件哈希
        self.web_screenshot_file_hash = web_screenshot_file_hash
        # 网页源码文件下载链接
        self.web_source_file = web_source_file
        # 网页源码文件哈希
        self.web_source_file_hash = web_source_file_hash
        # 视频源文件下载链接
        self.video_file = video_file
        # 视频源文件哈希
        self.video_file_hash = video_file_hash
        # 手机自清洁文件下载链接
        self.extend_device_check_file = extend_device_check_file
        # 手机自清洁文件哈希
        self.extend_device_check_file_hash = extend_device_check_file_hash
        # 手机操作日志下载链接
        self.extend_device_process_file = extend_device_process_file
        # 手机操作日志哈希
        self.extend_device_process_file_hash = extend_device_process_file_hash

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.process_log_file is not None:
            result['process_log_file'] = self.process_log_file
        if self.process_log_file_hash is not None:
            result['process_log_file_hash'] = self.process_log_file_hash
        if self.check_log_file is not None:
            result['check_log_file'] = self.check_log_file
        if self.check_log_file_hash is not None:
            result['check_log_file_hash'] = self.check_log_file_hash
        if self.web_screenshot_file is not None:
            result['web_screenshot_file'] = self.web_screenshot_file
        if self.web_screenshot_file_hash is not None:
            result['web_screenshot_file_hash'] = self.web_screenshot_file_hash
        if self.web_source_file is not None:
            result['web_source_file'] = self.web_source_file
        if self.web_source_file_hash is not None:
            result['web_source_file_hash'] = self.web_source_file_hash
        if self.video_file is not None:
            result['video_file'] = self.video_file
        if self.video_file_hash is not None:
            result['video_file_hash'] = self.video_file_hash
        if self.extend_device_check_file is not None:
            result['extend_device_check_file'] = self.extend_device_check_file
        if self.extend_device_check_file_hash is not None:
            result['extend_device_check_file_hash'] = self.extend_device_check_file_hash
        if self.extend_device_process_file is not None:
            result['extend_device_process_file'] = self.extend_device_process_file
        if self.extend_device_process_file_hash is not None:
            result['extend_device_process_file_hash'] = self.extend_device_process_file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('process_log_file') is not None:
            self.process_log_file = m.get('process_log_file')
        if m.get('process_log_file_hash') is not None:
            self.process_log_file_hash = m.get('process_log_file_hash')
        if m.get('check_log_file') is not None:
            self.check_log_file = m.get('check_log_file')
        if m.get('check_log_file_hash') is not None:
            self.check_log_file_hash = m.get('check_log_file_hash')
        if m.get('web_screenshot_file') is not None:
            self.web_screenshot_file = m.get('web_screenshot_file')
        if m.get('web_screenshot_file_hash') is not None:
            self.web_screenshot_file_hash = m.get('web_screenshot_file_hash')
        if m.get('web_source_file') is not None:
            self.web_source_file = m.get('web_source_file')
        if m.get('web_source_file_hash') is not None:
            self.web_source_file_hash = m.get('web_source_file_hash')
        if m.get('video_file') is not None:
            self.video_file = m.get('video_file')
        if m.get('video_file_hash') is not None:
            self.video_file_hash = m.get('video_file_hash')
        if m.get('extend_device_check_file') is not None:
            self.extend_device_check_file = m.get('extend_device_check_file')
        if m.get('extend_device_check_file_hash') is not None:
            self.extend_device_check_file_hash = m.get('extend_device_check_file_hash')
        if m.get('extend_device_process_file') is not None:
            self.extend_device_process_file = m.get('extend_device_process_file')
        if m.get('extend_device_process_file_hash') is not None:
            self.extend_device_process_file_hash = m.get('extend_device_process_file_hash')
        return self


class ResembleRiskData(TeaModel):
    def __init__(
        self,
        code: int = None,
        work_id: str = None,
        resemble: str = None,
        work_download_url: str = None,
        risk_level: int = None,
    ):
        # 识别结果
        self.code = code
        # 重复作品ID
        self.work_id = work_id
        # 相似值百分比
        self.resemble = resemble
        # 相似作品下载链接
        self.work_download_url = work_download_url
        # 风险等级
        self.risk_level = risk_level

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.work_id, 'work_id')
        self.validate_required(self.resemble, 'resemble')
        self.validate_required(self.work_download_url, 'work_download_url')
        self.validate_required(self.risk_level, 'risk_level')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.work_id is not None:
            result['work_id'] = self.work_id
        if self.resemble is not None:
            result['resemble'] = self.resemble
        if self.work_download_url is not None:
            result['work_download_url'] = self.work_download_url
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('work_id') is not None:
            self.work_id = m.get('work_id')
        if m.get('resemble') is not None:
            self.resemble = m.get('resemble')
        if m.get('work_download_url') is not None:
            self.work_download_url = m.get('work_download_url')
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        return self


class ContentRiskData(TeaModel):
    def __init__(
        self,
        code: int = None,
        content_type: str = None,
        risk_name: str = None,
        risk_level: int = None,
        risk_score: int = None,
    ):
        # 识别结果
        self.code = code
        # 内容类型
        self.content_type = content_type
        # 风险名称
        self.risk_name = risk_name
        # 风险等级
        self.risk_level = risk_level
        # 风险评分
        self.risk_score = risk_score

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.content_type, 'content_type')
        self.validate_required(self.risk_name, 'risk_name')
        self.validate_required(self.risk_level, 'risk_level')
        self.validate_required(self.risk_score, 'risk_score')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.risk_name is not None:
            result['risk_name'] = self.risk_name
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('risk_name') is not None:
            self.risk_name = m.get('risk_name')
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        return self


class LabelRiskData(TeaModel):
    def __init__(
        self,
        code: int = None,
        label_name: str = None,
        is_risk: bool = None,
        similar_value: str = None,
        risk_level: int = None,
    ):
        # 识别结果
        self.code = code
        # 识别出的标签名称
        self.label_name = label_name
        # 识别出的标签是否与用户选择的标签匹配
        self.is_risk = is_risk
        # 识别出的标签匹配度百分比
        self.similar_value = similar_value
        # 风险等级
        self.risk_level = risk_level

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.label_name, 'label_name')
        self.validate_required(self.is_risk, 'is_risk')
        self.validate_required(self.similar_value, 'similar_value')
        self.validate_required(self.risk_level, 'risk_level')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.label_name is not None:
            result['label_name'] = self.label_name
        if self.is_risk is not None:
            result['is_risk'] = self.is_risk
        if self.similar_value is not None:
            result['similar_value'] = self.similar_value
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('label_name') is not None:
            self.label_name = m.get('label_name')
        if m.get('is_risk') is not None:
            self.is_risk = m.get('is_risk')
        if m.get('similar_value') is not None:
            self.similar_value = m.get('similar_value')
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        return self


class MonitorProviderCapability(TeaModel):
    def __init__(
        self,
        provider_id: str = None,
        provider_name: str = None,
        provider_description: str = None,
        is_provided: bool = None,
    ):
        # 供应商id
        self.provider_id = provider_id
        # 供应商名称
        self.provider_name = provider_name
        # 供应商描述
        self.provider_description = provider_description
        # 是否推荐供应商
        self.is_provided = is_provided

    def validate(self):
        self.validate_required(self.provider_id, 'provider_id')
        self.validate_required(self.provider_name, 'provider_name')
        self.validate_required(self.provider_description, 'provider_description')
        self.validate_required(self.is_provided, 'is_provided')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.provider_name is not None:
            result['provider_name'] = self.provider_name
        if self.provider_description is not None:
            result['provider_description'] = self.provider_description
        if self.is_provided is not None:
            result['is_provided'] = self.is_provided
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('provider_name') is not None:
            self.provider_name = m.get('provider_name')
        if m.get('provider_description') is not None:
            self.provider_description = m.get('provider_description')
        if m.get('is_provided') is not None:
            self.is_provided = m.get('is_provided')
        return self


class RecordScreenData(TeaModel):
    def __init__(
        self,
        error_reason: str = None,
        file_hash: str = None,
        gmt_end: int = None,
        gmt_start: int = None,
        os_version: str = None,
        screen_info: ScreenInfo = None,
        screen_zip: str = None,
        sw_version: str = None,
        tsr: str = None,
        tx_hash: str = None,
        file_size: int = None,
        block_height: int = None,
        timestamp: int = None,
        certificate_url: str = None,
        certificate_storage_no: str = None,
        zip_tx_hash: str = None,
        inventory: str = None,
        zip_file_hash: str = None,
    ):
        # 错误原因（状态为FAIL才有数据）
        self.error_reason = error_reason
        # 录屏文件Hash值
        self.file_hash = file_hash
        # 录屏结束时间
        self.gmt_end = gmt_end
        # 录屏开始时间
        self.gmt_start = gmt_start
        # OS版本号
        self.os_version = os_version
        # 录屏文件信息
        self.screen_info = screen_info
        # 证据包下载地址（状态为SUCCESS 才有数据）
        self.screen_zip = screen_zip
        # 录屏软件版本号
        self.sw_version = sw_version
        # 可信时间戳的返回对象
        self.tsr = tsr
        # 统一证据编号
        self.tx_hash = tx_hash
        # 录屏文件大小
        self.file_size = file_size
        # 录屏文件存证块高
        self.block_height = block_height
        # 录屏文件上链时间
        self.timestamp = timestamp
        # 录屏文件公证处证书下载链接
        self.certificate_url = certificate_url
        # 公证处证书编号
        self.certificate_storage_no = certificate_storage_no
        # 证据包存证交易hash
        self.zip_tx_hash = zip_tx_hash
        # 取证备注信息
        self.inventory = inventory
        # 证据包文件hash
        self.zip_file_hash = zip_file_hash

    def validate(self):
        self.validate_required(self.gmt_end, 'gmt_end')
        self.validate_required(self.gmt_start, 'gmt_start')
        self.validate_required(self.os_version, 'os_version')
        if self.screen_info:
            self.screen_info.validate()
        self.validate_required(self.sw_version, 'sw_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        if self.gmt_end is not None:
            result['gmt_end'] = self.gmt_end
        if self.gmt_start is not None:
            result['gmt_start'] = self.gmt_start
        if self.os_version is not None:
            result['os_version'] = self.os_version
        if self.screen_info is not None:
            result['screen_info'] = self.screen_info.to_map()
        if self.screen_zip is not None:
            result['screen_zip'] = self.screen_zip
        if self.sw_version is not None:
            result['sw_version'] = self.sw_version
        if self.tsr is not None:
            result['tsr'] = self.tsr
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        if self.certificate_storage_no is not None:
            result['certificate_storage_no'] = self.certificate_storage_no
        if self.zip_tx_hash is not None:
            result['zip_tx_hash'] = self.zip_tx_hash
        if self.inventory is not None:
            result['inventory'] = self.inventory
        if self.zip_file_hash is not None:
            result['zip_file_hash'] = self.zip_file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        if m.get('gmt_end') is not None:
            self.gmt_end = m.get('gmt_end')
        if m.get('gmt_start') is not None:
            self.gmt_start = m.get('gmt_start')
        if m.get('os_version') is not None:
            self.os_version = m.get('os_version')
        if m.get('screen_info') is not None:
            temp_model = ScreenInfo()
            self.screen_info = temp_model.from_map(m['screen_info'])
        if m.get('screen_zip') is not None:
            self.screen_zip = m.get('screen_zip')
        if m.get('sw_version') is not None:
            self.sw_version = m.get('sw_version')
        if m.get('tsr') is not None:
            self.tsr = m.get('tsr')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        if m.get('certificate_storage_no') is not None:
            self.certificate_storage_no = m.get('certificate_storage_no')
        if m.get('zip_tx_hash') is not None:
            self.zip_tx_hash = m.get('zip_tx_hash')
        if m.get('inventory') is not None:
            self.inventory = m.get('inventory')
        if m.get('zip_file_hash') is not None:
            self.zip_file_hash = m.get('zip_file_hash')
        return self


class VerifyStatementData(TeaModel):
    def __init__(
        self,
        statement_tx_hash: str = None,
        statement_file_id: str = None,
        statement_file_hash: str = None,
    ):
        # 权利声明书存证交易HASH
        self.statement_tx_hash = statement_tx_hash
        # 权利声明书文件ID（和statementFileId 二选一,如果都传使用statementFileHash）
        self.statement_file_id = statement_file_id
        # 权利声明书文件HASH（和statementFileId 二选一,如果都传使用statementFileHash）
        self.statement_file_hash = statement_file_hash

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.statement_tx_hash is not None:
            result['statement_tx_hash'] = self.statement_tx_hash
        if self.statement_file_id is not None:
            result['statement_file_id'] = self.statement_file_id
        if self.statement_file_hash is not None:
            result['statement_file_hash'] = self.statement_file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('statement_tx_hash') is not None:
            self.statement_tx_hash = m.get('statement_tx_hash')
        if m.get('statement_file_id') is not None:
            self.statement_file_id = m.get('statement_file_id')
        if m.get('statement_file_hash') is not None:
            self.statement_file_hash = m.get('statement_file_hash')
        return self


class GoodSkuInfo(TeaModel):
    def __init__(
        self,
        sku_num: str = None,
        price: int = None,
    ):
        # 授权规格序号
        self.sku_num = sku_num
        # 授权规格价格(单位：分)
        self.price = price

    def validate(self):
        self.validate_required(self.sku_num, 'sku_num')
        self.validate_required(self.price, 'price')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sku_num is not None:
            result['sku_num'] = self.sku_num
        if self.price is not None:
            result['price'] = self.price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sku_num') is not None:
            self.sku_num = m.get('sku_num')
        if m.get('price') is not None:
            self.price = m.get('price')
        return self


class NotaryPublicOffice(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        province: str = None,
        city: str = None,
        org_name: str = None,
    ):
        # 公证处code
        self.code = code
        # 公证处名称
        self.name = name
        # 公证处所在省（直辖市）
        self.province = province
        # 公证处所在市
        self.city = city
        # 公证处完整名称
        self.org_name = org_name

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.province, 'province')
        self.validate_required(self.city, 'city')
        self.validate_required(self.org_name, 'org_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.province is not None:
            result['province'] = self.province
        if self.city is not None:
            result['city'] = self.city
        if self.org_name is not None:
            result['org_name'] = self.org_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        return self


class ScreenshotData(TeaModel):
    def __init__(
        self,
        url: str = None,
        gmt_evidence: int = None,
        file_hash: str = None,
        file_size: int = None,
        tx_hash: str = None,
        block_height: int = None,
        timestamp: int = None,
        tsr: str = None,
        certificate_url: str = None,
        certificate_storage_no: str = None,
        tool_version: str = None,
        screenshot_zip: str = None,
        screenshot_info: ScreenshotInfo = None,
        head_title: str = None,
        zip_tx_hash: str = None,
        error_reason: str = None,
        error_reason_cn: str = None,
        zip_file_hash: str = None,
    ):
        # 取证地址
        self.url = url
        # 网页取证时间
        self.gmt_evidence = gmt_evidence
        # 网页取证文件Hash值
        self.file_hash = file_hash
        # 网页取证文件大小
        self.file_size = file_size
        # 统一证据编号
        self.tx_hash = tx_hash
        # 网页取证文件存证块高
        self.block_height = block_height
        # 网页取证文件上链时间
        self.timestamp = timestamp
        # 可信时间戳的返回对象
        self.tsr = tsr
        # 网页截图文件公证处证书下载链接
        self.certificate_url = certificate_url
        # 公证处证书编号
        self.certificate_storage_no = certificate_storage_no
        # 网页取证工具软件版本号
        self.tool_version = tool_version
        # 证据包下载地址（状态为SUCCESS 才有数据）
        self.screenshot_zip = screenshot_zip
        # 取证文件信息
        self.screenshot_info = screenshot_info
        # 网页title
        self.head_title = head_title
        # 证据包交易hash
        self.zip_tx_hash = zip_tx_hash
        # 网页取证失败原因
        self.error_reason = error_reason
        # 中文失败原因
        self.error_reason_cn = error_reason_cn
        # 证据包文件hash
        self.zip_file_hash = zip_file_hash

    def validate(self):
        self.validate_required(self.url, 'url')
        if self.screenshot_info:
            self.screenshot_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.url is not None:
            result['url'] = self.url
        if self.gmt_evidence is not None:
            result['gmt_evidence'] = self.gmt_evidence
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.tsr is not None:
            result['tsr'] = self.tsr
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        if self.certificate_storage_no is not None:
            result['certificate_storage_no'] = self.certificate_storage_no
        if self.tool_version is not None:
            result['tool_version'] = self.tool_version
        if self.screenshot_zip is not None:
            result['screenshot_zip'] = self.screenshot_zip
        if self.screenshot_info is not None:
            result['screenshot_info'] = self.screenshot_info.to_map()
        if self.head_title is not None:
            result['head_title'] = self.head_title
        if self.zip_tx_hash is not None:
            result['zip_tx_hash'] = self.zip_tx_hash
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        if self.error_reason_cn is not None:
            result['error_reason_cn'] = self.error_reason_cn
        if self.zip_file_hash is not None:
            result['zip_file_hash'] = self.zip_file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('gmt_evidence') is not None:
            self.gmt_evidence = m.get('gmt_evidence')
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('tsr') is not None:
            self.tsr = m.get('tsr')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        if m.get('certificate_storage_no') is not None:
            self.certificate_storage_no = m.get('certificate_storage_no')
        if m.get('tool_version') is not None:
            self.tool_version = m.get('tool_version')
        if m.get('screenshot_zip') is not None:
            self.screenshot_zip = m.get('screenshot_zip')
        if m.get('screenshot_info') is not None:
            temp_model = ScreenshotInfo()
            self.screenshot_info = temp_model.from_map(m['screenshot_info'])
        if m.get('head_title') is not None:
            self.head_title = m.get('head_title')
        if m.get('zip_tx_hash') is not None:
            self.zip_tx_hash = m.get('zip_tx_hash')
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        if m.get('error_reason_cn') is not None:
            self.error_reason_cn = m.get('error_reason_cn')
        if m.get('zip_file_hash') is not None:
            self.zip_file_hash = m.get('zip_file_hash')
        return self


class MonitorProviderType(TeaModel):
    def __init__(
        self,
        file_type: str = None,
        submit_type: str = None,
        file_format: str = None,
        monitor_providers: List[MonitorProviderCapability] = None,
    ):
        # 监测文件类型
        self.file_type = file_type
        # 提交类型
        self.submit_type = submit_type
        # 文件格式
        self.file_format = file_format
        # 支持的服务商列表，已排序
        self.monitor_providers = monitor_providers

    def validate(self):
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.submit_type, 'submit_type')
        self.validate_required(self.monitor_providers, 'monitor_providers')
        if self.monitor_providers:
            for k in self.monitor_providers:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.submit_type is not None:
            result['submit_type'] = self.submit_type
        if self.file_format is not None:
            result['file_format'] = self.file_format
        result['monitor_providers'] = []
        if self.monitor_providers is not None:
            for k in self.monitor_providers:
                result['monitor_providers'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('submit_type') is not None:
            self.submit_type = m.get('submit_type')
        if m.get('file_format') is not None:
            self.file_format = m.get('file_format')
        self.monitor_providers = []
        if m.get('monitor_providers') is not None:
            for k in m.get('monitor_providers'):
                temp_model = MonitorProviderCapability()
                self.monitor_providers.append(temp_model.from_map(k))
        return self


class DciPublicationInfo(TeaModel):
    def __init__(
        self,
        publication_status: str = None,
        first_publication_date: str = None,
        first_publication_place: str = None,
        first_publication_code: str = None,
    ):
        # 作品发表状态
        self.publication_status = publication_status
        # 首次发表日期
        self.first_publication_date = first_publication_date
        # 首次发表地址
        self.first_publication_place = first_publication_place
        # 首次发表地点地区编码
        self.first_publication_code = first_publication_code

    def validate(self):
        self.validate_required(self.publication_status, 'publication_status')
        self.validate_required(self.first_publication_date, 'first_publication_date')
        self.validate_required(self.first_publication_code, 'first_publication_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.publication_status is not None:
            result['publication_status'] = self.publication_status
        if self.first_publication_date is not None:
            result['first_publication_date'] = self.first_publication_date
        if self.first_publication_place is not None:
            result['first_publication_place'] = self.first_publication_place
        if self.first_publication_code is not None:
            result['first_publication_code'] = self.first_publication_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('publication_status') is not None:
            self.publication_status = m.get('publication_status')
        if m.get('first_publication_date') is not None:
            self.first_publication_date = m.get('first_publication_date')
        if m.get('first_publication_place') is not None:
            self.first_publication_place = m.get('first_publication_place')
        if m.get('first_publication_code') is not None:
            self.first_publication_code = m.get('first_publication_code')
        return self


class DciCreationInfo(TeaModel):
    def __init__(
        self,
        creation_nature: str = None,
        creation_completion_date: str = None,
        creation_completion_place: str = None,
        creation_completion_code: str = None,
    ):
        # 作品创作性质
        self.creation_nature = creation_nature
        # 创作完成日期
        self.creation_completion_date = creation_completion_date
        # 创作完成地点
        self.creation_completion_place = creation_completion_place
        # 作品创作地点地区编码
        self.creation_completion_code = creation_completion_code

    def validate(self):
        self.validate_required(self.creation_nature, 'creation_nature')
        self.validate_required(self.creation_completion_date, 'creation_completion_date')
        self.validate_required(self.creation_completion_code, 'creation_completion_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.creation_nature is not None:
            result['creation_nature'] = self.creation_nature
        if self.creation_completion_date is not None:
            result['creation_completion_date'] = self.creation_completion_date
        if self.creation_completion_place is not None:
            result['creation_completion_place'] = self.creation_completion_place
        if self.creation_completion_code is not None:
            result['creation_completion_code'] = self.creation_completion_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('creation_nature') is not None:
            self.creation_nature = m.get('creation_nature')
        if m.get('creation_completion_date') is not None:
            self.creation_completion_date = m.get('creation_completion_date')
        if m.get('creation_completion_place') is not None:
            self.creation_completion_place = m.get('creation_completion_place')
        if m.get('creation_completion_code') is not None:
            self.creation_completion_code = m.get('creation_completion_code')
        return self


class RightsInfo(TeaModel):
    def __init__(
        self,
        completed_time: int = None,
        completed_place: str = None,
        is_publish: bool = None,
        publish_time: int = None,
        publish_place: str = None,
        publish_web: str = None,
        is_author: bool = None,
        author_cert_name: str = None,
        author_cert_no: str = None,
    ):
        # 作品创作完成时间
        self.completed_time = completed_time
        # 作品创作完成地点（最长128个字符）
        self.completed_place = completed_place
        # 是否发表
        self.is_publish = is_publish
        # 发表时间（如果isPublish为true则必填）
        self.publish_time = publish_time
        # 发表地点（如果isPublish为true则必填，最长128个字符）
        self.publish_place = publish_place
        # 发表网址（如果isPublish为true则必填，最长1024个字符）
        self.publish_web = publish_web
        # 是否是作者
        self.is_author = is_author
        # 作者姓名（如果isAuthor为true则必填，最长32个字符）
        self.author_cert_name = author_cert_name
        # 作者身份证号（如果isAuthor为true则必填）
        self.author_cert_no = author_cert_no

    def validate(self):
        self.validate_required(self.completed_time, 'completed_time')
        self.validate_required(self.completed_place, 'completed_place')
        if self.completed_place is not None:
            self.validate_max_length(self.completed_place, 'completed_place', 128)
        self.validate_required(self.is_publish, 'is_publish')
        if self.publish_place is not None:
            self.validate_max_length(self.publish_place, 'publish_place', 128)
        if self.publish_web is not None:
            self.validate_max_length(self.publish_web, 'publish_web', 1024)
        self.validate_required(self.is_author, 'is_author')
        if self.author_cert_name is not None:
            self.validate_max_length(self.author_cert_name, 'author_cert_name', 32)
        if self.author_cert_no is not None:
            self.validate_max_length(self.author_cert_no, 'author_cert_no', 30)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.completed_time is not None:
            result['completed_time'] = self.completed_time
        if self.completed_place is not None:
            result['completed_place'] = self.completed_place
        if self.is_publish is not None:
            result['is_publish'] = self.is_publish
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.publish_place is not None:
            result['publish_place'] = self.publish_place
        if self.publish_web is not None:
            result['publish_web'] = self.publish_web
        if self.is_author is not None:
            result['is_author'] = self.is_author
        if self.author_cert_name is not None:
            result['author_cert_name'] = self.author_cert_name
        if self.author_cert_no is not None:
            result['author_cert_no'] = self.author_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('completed_time') is not None:
            self.completed_time = m.get('completed_time')
        if m.get('completed_place') is not None:
            self.completed_place = m.get('completed_place')
        if m.get('is_publish') is not None:
            self.is_publish = m.get('is_publish')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('publish_place') is not None:
            self.publish_place = m.get('publish_place')
        if m.get('publish_web') is not None:
            self.publish_web = m.get('publish_web')
        if m.get('is_author') is not None:
            self.is_author = m.get('is_author')
        if m.get('author_cert_name') is not None:
            self.author_cert_name = m.get('author_cert_name')
        if m.get('author_cert_no') is not None:
            self.author_cert_no = m.get('author_cert_no')
        return self


class VerifyUserData(TeaModel):
    def __init__(
        self,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        register_person_tx_hash: str = None,
    ):
        # 证件名称
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 登记人信息存证交易HASH
        self.register_person_tx_hash = register_person_tx_hash

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.register_person_tx_hash is not None:
            result['register_person_tx_hash'] = self.register_person_tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('register_person_tx_hash') is not None:
            self.register_person_tx_hash = m.get('register_person_tx_hash')
        return self


class AuthInfo(TeaModel):
    def __init__(
        self,
        right_code: str = None,
        region_code: str = None,
        usage_code: str = None,
        terminal_code: str = None,
        media_code: str = None,
        right_item_character: str = None,
        transfer_status: str = None,
    ):
        # 授权权利项
        self.right_code = right_code
        # 许可地域，默认中国境内，不包括香港等
        self.region_code = region_code
        # 许可方式
        self.usage_code = usage_code
        # 许可终端
        self.terminal_code = terminal_code
        # 传播媒介，默认互联网
        self.media_code = media_code
        # 是否独占,默认 普通专有 GENERAL
        self.right_item_character = right_item_character
        # 是否可转让,默认不可转让
        self.transfer_status = transfer_status

    def validate(self):
        self.validate_required(self.right_code, 'right_code')
        self.validate_required(self.usage_code, 'usage_code')
        self.validate_required(self.terminal_code, 'terminal_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.right_code is not None:
            result['right_code'] = self.right_code
        if self.region_code is not None:
            result['region_code'] = self.region_code
        if self.usage_code is not None:
            result['usage_code'] = self.usage_code
        if self.terminal_code is not None:
            result['terminal_code'] = self.terminal_code
        if self.media_code is not None:
            result['media_code'] = self.media_code
        if self.right_item_character is not None:
            result['right_item_character'] = self.right_item_character
        if self.transfer_status is not None:
            result['transfer_status'] = self.transfer_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('right_code') is not None:
            self.right_code = m.get('right_code')
        if m.get('region_code') is not None:
            self.region_code = m.get('region_code')
        if m.get('usage_code') is not None:
            self.usage_code = m.get('usage_code')
        if m.get('terminal_code') is not None:
            self.terminal_code = m.get('terminal_code')
        if m.get('media_code') is not None:
            self.media_code = m.get('media_code')
        if m.get('right_item_character') is not None:
            self.right_item_character = m.get('right_item_character')
        if m.get('transfer_status') is not None:
            self.transfer_status = m.get('transfer_status')
        return self


class ScreenCancelInfo(TeaModel):
    def __init__(
        self,
        cancel_in_min: int = None,
        cancel_attempt_left: int = None,
    ):
        # 允许放弃时长（分钟）
        self.cancel_in_min = cancel_in_min
        # 可用放弃次数
        self.cancel_attempt_left = cancel_attempt_left

    def validate(self):
        self.validate_required(self.cancel_in_min, 'cancel_in_min')
        self.validate_required(self.cancel_attempt_left, 'cancel_attempt_left')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cancel_in_min is not None:
            result['cancel_in_min'] = self.cancel_in_min
        if self.cancel_attempt_left is not None:
            result['cancel_attempt_left'] = self.cancel_attempt_left
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cancel_in_min') is not None:
            self.cancel_in_min = m.get('cancel_in_min')
        if m.get('cancel_attempt_left') is not None:
            self.cancel_attempt_left = m.get('cancel_attempt_left')
        return self


class EvidenceUrlInfo(TeaModel):
    def __init__(
        self,
        url: str = None,
        auto_surfing_minute: int = None,
    ):
        # 取证网址
        self.url = url
        # 音视频取证时间
        self.auto_surfing_minute = auto_surfing_minute

    def validate(self):
        self.validate_required(self.url, 'url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.url is not None:
            result['url'] = self.url
        if self.auto_surfing_minute is not None:
            result['auto_surfing_minute'] = self.auto_surfing_minute
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('auto_surfing_minute') is not None:
            self.auto_surfing_minute = m.get('auto_surfing_minute')
        return self


class DirectMonitorResult(TeaModel):
    def __init__(
        self,
        monitor_result_id: str = None,
        similar_resource_url: str = None,
        similar_web_url: str = None,
        title: str = None,
        author: str = None,
        upload_time: str = None,
    ):
        # 监测结果id
        self.monitor_result_id = monitor_result_id
        # 相似的资源链接
        self.similar_resource_url = similar_resource_url
        # 相似资源所在的网址链接
        self.similar_web_url = similar_web_url
        # 资源标题
        self.title = title
        # 资源作者
        self.author = author
        # 资源上传时间，格式yyyy-MM-dd HH:mm:ss
        self.upload_time = upload_time

    def validate(self):
        self.validate_required(self.monitor_result_id, 'monitor_result_id')
        self.validate_required(self.similar_resource_url, 'similar_resource_url')
        self.validate_required(self.similar_web_url, 'similar_web_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.monitor_result_id is not None:
            result['monitor_result_id'] = self.monitor_result_id
        if self.similar_resource_url is not None:
            result['similar_resource_url'] = self.similar_resource_url
        if self.similar_web_url is not None:
            result['similar_web_url'] = self.similar_web_url
        if self.title is not None:
            result['title'] = self.title
        if self.author is not None:
            result['author'] = self.author
        if self.upload_time is not None:
            result['upload_time'] = self.upload_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('monitor_result_id') is not None:
            self.monitor_result_id = m.get('monitor_result_id')
        if m.get('similar_resource_url') is not None:
            self.similar_resource_url = m.get('similar_resource_url')
        if m.get('similar_web_url') is not None:
            self.similar_web_url = m.get('similar_web_url')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('author') is not None:
            self.author = m.get('author')
        if m.get('upload_time') is not None:
            self.upload_time = m.get('upload_time')
        return self


class SecurityData(TeaModel):
    def __init__(
        self,
        result: str = None,
        risk_data: List[str] = None,
    ):
        # 内容安全检查结果
        self.result = result
        # 有风险的内容
        self.risk_data = risk_data

    def validate(self):
        self.validate_required(self.result, 'result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result is not None:
            result['result'] = self.result
        if self.risk_data is not None:
            result['risk_data'] = self.risk_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('risk_data') is not None:
            self.risk_data = m.get('risk_data')
        return self


class InvoiceInfo(TeaModel):
    def __init__(
        self,
        invoice_type: str = None,
        invoice_header: str = None,
        taxpayer_number: str = None,
        registered_address: str = None,
        registered_tel: str = None,
        open_account_tel: str = None,
        open_account_bank: str = None,
        bank_account: str = None,
    ):
        # 发票类型 InvoiceTypeEnum目前只支持普票
        # (NORMAL,ELC,普票)
        # (SPECIAL,VAT,专票)
        self.invoice_type = invoice_type
        # 发票抬头（著作权人之一）
        self.invoice_header = invoice_header
        # 纳税人识别号（机构必填）
        self.taxpayer_number = taxpayer_number
        # 注册地址（专票必填）
        self.registered_address = registered_address
        # 注册电话（专票必填）
        self.registered_tel = registered_tel
        # 开户电话（专票必填）
        self.open_account_tel = open_account_tel
        # 开户银行（专票必填）
        self.open_account_bank = open_account_bank
        # 银行账号（专票必填）
        self.bank_account = bank_account

    def validate(self):
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.invoice_header, 'invoice_header')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.invoice_header is not None:
            result['invoice_header'] = self.invoice_header
        if self.taxpayer_number is not None:
            result['taxpayer_number'] = self.taxpayer_number
        if self.registered_address is not None:
            result['registered_address'] = self.registered_address
        if self.registered_tel is not None:
            result['registered_tel'] = self.registered_tel
        if self.open_account_tel is not None:
            result['open_account_tel'] = self.open_account_tel
        if self.open_account_bank is not None:
            result['open_account_bank'] = self.open_account_bank
        if self.bank_account is not None:
            result['bank_account'] = self.bank_account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('invoice_header') is not None:
            self.invoice_header = m.get('invoice_header')
        if m.get('taxpayer_number') is not None:
            self.taxpayer_number = m.get('taxpayer_number')
        if m.get('registered_address') is not None:
            self.registered_address = m.get('registered_address')
        if m.get('registered_tel') is not None:
            self.registered_tel = m.get('registered_tel')
        if m.get('open_account_tel') is not None:
            self.open_account_tel = m.get('open_account_tel')
        if m.get('open_account_bank') is not None:
            self.open_account_bank = m.get('open_account_bank')
        if m.get('bank_account') is not None:
            self.bank_account = m.get('bank_account')
        return self


class CertificateData(TeaModel):
    def __init__(
        self,
        task_id: str = None,
        user_id: str = None,
        dci_code: str = None,
        certificate_url: str = None,
    ):
        # 任务ID
        self.task_id = task_id
        # 版权用户UID
        self.user_id = user_id
        # DCI码
        self.dci_code = dci_code
        # 证书下载的链接地址
        self.certificate_url = certificate_url

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.dci_code, 'dci_code')
        self.validate_required(self.certificate_url, 'certificate_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.dci_code is not None:
            result['dci_code'] = self.dci_code
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('dci_code') is not None:
            self.dci_code = m.get('dci_code')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        return self


class AccountData(TeaModel):
    def __init__(
        self,
        account_id: str = None,
        account_name: str = None,
        account_platform: str = None,
    ):
        # 账号id
        self.account_id = account_id
        # 账号名称
        self.account_name = account_name
        # 账号平台（支付宝，淘宝，微信，抖音等）
        self.account_platform = account_platform

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.account_name, 'account_name')
        self.validate_required(self.account_platform, 'account_platform')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.account_name is not None:
            result['account_name'] = self.account_name
        if self.account_platform is not None:
            result['account_platform'] = self.account_platform
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        if m.get('account_platform') is not None:
            self.account_platform = m.get('account_platform')
        return self


class ProxyData(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        tenant_name: str = None,
        if_measure: bool = None,
    ):
        # 金融云租户id
        self.tenant_id = tenant_id
        # 租户名称
        self.tenant_name = tenant_name
        # 是否计量
        self.if_measure = if_measure

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.tenant_name, 'tenant_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.if_measure is not None:
            result['if_measure'] = self.if_measure
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('if_measure') is not None:
            self.if_measure = m.get('if_measure')
        return self


class CopyrightCertInfo(TeaModel):
    def __init__(
        self,
        cert_no: str = None,
        cert_name: str = None,
        cert_type: str = None,
    ):
        # 证件号码
        self.cert_no = cert_no
        # 证件名称
        self.cert_name = cert_name
        # 证件类型
        self.cert_type = cert_type

    def validate(self):
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_type, 'cert_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        return self


class MonitorTask(TeaModel):
    def __init__(
        self,
        content_desc: str = None,
        content_title: str = None,
        file_length_in_second: int = None,
        keywords: List[str] = None,
        monitor_task_id: str = None,
        name: str = None,
        provider_id: str = None,
        result_count: int = None,
        scopes: List[str] = None,
        status: str = None,
        task_duration: int = None,
        task_end: int = None,
        task_start: int = None,
        file_type: str = None,
        file_size: int = None,
        submit_content: str = None,
        submit_type: str = None,
        failure_msg: str = None,
        failure_code: str = None,
    ):
        # 内容表述
        # 
        # 
        self.content_desc = content_desc
        # 监测任务标题
        # 
        # 
        self.content_title = content_title
        # 监测文件时长，主要用于视频监测、音频监测的时长记录
        self.file_length_in_second = file_length_in_second
        # 监测关键字
        # 
        # 
        self.keywords = keywords
        # 监测任务ID
        # 
        self.monitor_task_id = monitor_task_id
        # 任务名称
        # 
        # 
        self.name = name
        # 监测供应商id
        self.provider_id = provider_id
        # 监测结果数量
        # 
        # 
        self.result_count = result_count
        # 监测范围
        # 
        # 
        self.scopes = scopes
        # 任务状态
        # 
        # INIT
        # 
        # WORKING
        # 
        # FINISH
        # 
        # FAILURE
        # 
        # DELETE
        self.status = status
        # 监测时长(天)
        # 
        # 
        self.task_duration = task_duration
        # 任务结束时间
        # 
        # 
        self.task_end = task_end
        # 任务开始时间
        # 
        # 
        self.task_start = task_start
        # 文件类别
        # 
        # IMAGE
        # 
        # TEXT
        # 
        # VIDEO
        self.file_type = file_type
        # 文件大小
        self.file_size = file_size
        # submitType是url就是url地址 submitType 是file就是oss fileId
        self.submit_content = submit_content
        # 提交任务的类型:FILE/URL
        # 不填为FILE
        # FILE表示文件上传素材，URL表示上传URL
        self.submit_type = submit_type
        # 当status为failure时的具体错误信息（中文描述）
        self.failure_msg = failure_msg
        # 当status为failure时的具体错误信息（错误枚举）
        self.failure_code = failure_code

    def validate(self):
        self.validate_required(self.keywords, 'keywords')
        self.validate_required(self.monitor_task_id, 'monitor_task_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.scopes, 'scopes')
        self.validate_required(self.status, 'status')
        self.validate_required(self.task_duration, 'task_duration')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.submit_content, 'submit_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content_desc is not None:
            result['content_desc'] = self.content_desc
        if self.content_title is not None:
            result['content_title'] = self.content_title
        if self.file_length_in_second is not None:
            result['file_length_in_second'] = self.file_length_in_second
        if self.keywords is not None:
            result['keywords'] = self.keywords
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.name is not None:
            result['name'] = self.name
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.result_count is not None:
            result['result_count'] = self.result_count
        if self.scopes is not None:
            result['scopes'] = self.scopes
        if self.status is not None:
            result['status'] = self.status
        if self.task_duration is not None:
            result['task_duration'] = self.task_duration
        if self.task_end is not None:
            result['task_end'] = self.task_end
        if self.task_start is not None:
            result['task_start'] = self.task_start
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.submit_content is not None:
            result['submit_content'] = self.submit_content
        if self.submit_type is not None:
            result['submit_type'] = self.submit_type
        if self.failure_msg is not None:
            result['failure_msg'] = self.failure_msg
        if self.failure_code is not None:
            result['failure_code'] = self.failure_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content_desc') is not None:
            self.content_desc = m.get('content_desc')
        if m.get('content_title') is not None:
            self.content_title = m.get('content_title')
        if m.get('file_length_in_second') is not None:
            self.file_length_in_second = m.get('file_length_in_second')
        if m.get('keywords') is not None:
            self.keywords = m.get('keywords')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('result_count') is not None:
            self.result_count = m.get('result_count')
        if m.get('scopes') is not None:
            self.scopes = m.get('scopes')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('task_duration') is not None:
            self.task_duration = m.get('task_duration')
        if m.get('task_end') is not None:
            self.task_end = m.get('task_end')
        if m.get('task_start') is not None:
            self.task_start = m.get('task_start')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('submit_content') is not None:
            self.submit_content = m.get('submit_content')
        if m.get('submit_type') is not None:
            self.submit_type = m.get('submit_type')
        if m.get('failure_msg') is not None:
            self.failure_msg = m.get('failure_msg')
        if m.get('failure_code') is not None:
            self.failure_code = m.get('failure_code')
        return self


class PlayListEntity(TeaModel):
    def __init__(
        self,
        play_list_name: str = None,
        authorize_type: str = None,
        authorize_scope_type: str = None,
        protect_rights_type: str = None,
        protect_rights_scope_type: str = None,
        authorization_start_date: str = None,
        authorization_time_length: int = None,
        auth_platform: List[str] = None,
    ):
        # 播放列表名称，可包含多个视频
        self.play_list_name = play_list_name
        # 表示授权类型，仅支持EXCLUSIVE，表示独家
        # 默认EXCLUSIVE
        self.authorize_type = authorize_type
        # 授权类型范围，仅支持OVERSEA，表示全海外
        # 默认OVERSEA
        self.authorize_scope_type = authorize_scope_type
        # 维权类型，仅支持CONTAIN_PROTECT，表示包含维权
        # 默认CONTAIN_PROTECT
        self.protect_rights_type = protect_rights_type
        # 维权类型范围，仅支持OVERSEA，表示全海外
        # 默认OVERSEA
        self.protect_rights_scope_type = protect_rights_scope_type
        # 内容授权开始日期yyyy-MM-dd
        self.authorization_start_date = authorization_start_date
        # 内容授权时长,单位：年，目前支持1~3年，
        # 注意结束时间即开始时间 + 授权时长 不能早于当前时间
        self.authorization_time_length = authorization_time_length
        # 内容授权平台列表：
        # 默认授权平台都会进行运营，当前仅支持YOUTUBE
        self.auth_platform = auth_platform

    def validate(self):
        self.validate_required(self.play_list_name, 'play_list_name')
        self.validate_required(self.authorization_start_date, 'authorization_start_date')
        self.validate_required(self.authorization_time_length, 'authorization_time_length')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.play_list_name is not None:
            result['play_list_name'] = self.play_list_name
        if self.authorize_type is not None:
            result['authorize_type'] = self.authorize_type
        if self.authorize_scope_type is not None:
            result['authorize_scope_type'] = self.authorize_scope_type
        if self.protect_rights_type is not None:
            result['protect_rights_type'] = self.protect_rights_type
        if self.protect_rights_scope_type is not None:
            result['protect_rights_scope_type'] = self.protect_rights_scope_type
        if self.authorization_start_date is not None:
            result['authorization_start_date'] = self.authorization_start_date
        if self.authorization_time_length is not None:
            result['authorization_time_length'] = self.authorization_time_length
        if self.auth_platform is not None:
            result['auth_platform'] = self.auth_platform
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('play_list_name') is not None:
            self.play_list_name = m.get('play_list_name')
        if m.get('authorize_type') is not None:
            self.authorize_type = m.get('authorize_type')
        if m.get('authorize_scope_type') is not None:
            self.authorize_scope_type = m.get('authorize_scope_type')
        if m.get('protect_rights_type') is not None:
            self.protect_rights_type = m.get('protect_rights_type')
        if m.get('protect_rights_scope_type') is not None:
            self.protect_rights_scope_type = m.get('protect_rights_scope_type')
        if m.get('authorization_start_date') is not None:
            self.authorization_start_date = m.get('authorization_start_date')
        if m.get('authorization_time_length') is not None:
            self.authorization_time_length = m.get('authorization_time_length')
        if m.get('auth_platform') is not None:
            self.auth_platform = m.get('auth_platform')
        return self


class VerifyEvidenceData(TeaModel):
    def __init__(
        self,
        process_log_tx_hash: str = None,
        check_log_tx_hash: str = None,
    ):
        # 操作日志交易HASH
        self.process_log_tx_hash = process_log_tx_hash
        # 自清洁日志交易HASH
        self.check_log_tx_hash = check_log_tx_hash

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.process_log_tx_hash is not None:
            result['process_log_tx_hash'] = self.process_log_tx_hash
        if self.check_log_tx_hash is not None:
            result['check_log_tx_hash'] = self.check_log_tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('process_log_tx_hash') is not None:
            self.process_log_tx_hash = m.get('process_log_tx_hash')
        if m.get('check_log_tx_hash') is not None:
            self.check_log_tx_hash = m.get('check_log_tx_hash')
        return self


class GoodsInfo(TeaModel):
    def __init__(
        self,
        goods_id: str = None,
        goods_name: str = None,
        goods_status: str = None,
        classification: str = None,
        total_sold_num: int = None,
        standard_price_in_cent: int = None,
        title: str = None,
        auth_start_time: int = None,
        auth_end_time: int = None,
        publish_time: int = None,
    ):
        # 商品id
        self.goods_id = goods_id
        # 商品名称
        self.goods_name = goods_name
        # 商品状态
        self.goods_status = goods_status
        # 商品分类
        self.classification = classification
        # 售卖数量
        self.total_sold_num = total_sold_num
        # 售价（分）
        self.standard_price_in_cent = standard_price_in_cent
        # 商品标题
        self.title = title
        # 授权期限起始时间
        self.auth_start_time = auth_start_time
        # 授权期限结束时间
        self.auth_end_time = auth_end_time
        # 发布时间
        self.publish_time = publish_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.goods_name is not None:
            result['goods_name'] = self.goods_name
        if self.goods_status is not None:
            result['goods_status'] = self.goods_status
        if self.classification is not None:
            result['classification'] = self.classification
        if self.total_sold_num is not None:
            result['total_sold_num'] = self.total_sold_num
        if self.standard_price_in_cent is not None:
            result['standard_price_in_cent'] = self.standard_price_in_cent
        if self.title is not None:
            result['title'] = self.title
        if self.auth_start_time is not None:
            result['auth_start_time'] = self.auth_start_time
        if self.auth_end_time is not None:
            result['auth_end_time'] = self.auth_end_time
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('goods_name') is not None:
            self.goods_name = m.get('goods_name')
        if m.get('goods_status') is not None:
            self.goods_status = m.get('goods_status')
        if m.get('classification') is not None:
            self.classification = m.get('classification')
        if m.get('total_sold_num') is not None:
            self.total_sold_num = m.get('total_sold_num')
        if m.get('standard_price_in_cent') is not None:
            self.standard_price_in_cent = m.get('standard_price_in_cent')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('auth_start_time') is not None:
            self.auth_start_time = m.get('auth_start_time')
        if m.get('auth_end_time') is not None:
            self.auth_end_time = m.get('auth_end_time')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        return self


class WorksInfo(TeaModel):
    def __init__(
        self,
        works_name: str = None,
        works_type: str = None,
        works_type_en: str = None,
    ):
        # 作品名称
        self.works_name = works_name
        # 作品类型
        self.works_type = works_type
        # 作品类型英文标识
        self.works_type_en = works_type_en

    def validate(self):
        self.validate_required(self.works_name, 'works_name')
        self.validate_required(self.works_type, 'works_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.works_name is not None:
            result['works_name'] = self.works_name
        if self.works_type is not None:
            result['works_type'] = self.works_type
        if self.works_type_en is not None:
            result['works_type_en'] = self.works_type_en
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('works_name') is not None:
            self.works_name = m.get('works_name')
        if m.get('works_type') is not None:
            self.works_type = m.get('works_type')
        if m.get('works_type_en') is not None:
            self.works_type_en = m.get('works_type_en')
        return self


class ReviewData(TeaModel):
    def __init__(
        self,
        content_risk_data: List[ContentRiskData] = None,
        resemble_risk_data: List[ResembleRiskData] = None,
        label_risk_data: List[LabelRiskData] = None,
    ):
        # 内容安全识别结果
        self.content_risk_data = content_risk_data
        # 作品相似识别结果
        self.resemble_risk_data = resemble_risk_data
        # 作品标签识别结果
        self.label_risk_data = label_risk_data

    def validate(self):
        self.validate_required(self.content_risk_data, 'content_risk_data')
        if self.content_risk_data:
            for k in self.content_risk_data:
                if k:
                    k.validate()
        self.validate_required(self.resemble_risk_data, 'resemble_risk_data')
        if self.resemble_risk_data:
            for k in self.resemble_risk_data:
                if k:
                    k.validate()
        self.validate_required(self.label_risk_data, 'label_risk_data')
        if self.label_risk_data:
            for k in self.label_risk_data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['content_risk_data'] = []
        if self.content_risk_data is not None:
            for k in self.content_risk_data:
                result['content_risk_data'].append(k.to_map() if k else None)
        result['resemble_risk_data'] = []
        if self.resemble_risk_data is not None:
            for k in self.resemble_risk_data:
                result['resemble_risk_data'].append(k.to_map() if k else None)
        result['label_risk_data'] = []
        if self.label_risk_data is not None:
            for k in self.label_risk_data:
                result['label_risk_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.content_risk_data = []
        if m.get('content_risk_data') is not None:
            for k in m.get('content_risk_data'):
                temp_model = ContentRiskData()
                self.content_risk_data.append(temp_model.from_map(k))
        self.resemble_risk_data = []
        if m.get('resemble_risk_data') is not None:
            for k in m.get('resemble_risk_data'):
                temp_model = ResembleRiskData()
                self.resemble_risk_data.append(temp_model.from_map(k))
        self.label_risk_data = []
        if m.get('label_risk_data') is not None:
            for k in m.get('label_risk_data'):
                temp_model = LabelRiskData()
                self.label_risk_data.append(temp_model.from_map(k))
        return self


class DciRightInfo(TeaModel):
    def __init__(
        self,
        right_scope: str = None,
        right_obtain_way: str = None,
        ownership_way: str = None,
    ):
        # 作品权利范围
        self.right_scope = right_scope
        # 权利取得方式
        self.right_obtain_way = right_obtain_way
        # 权利归属方式
        self.ownership_way = ownership_way

    def validate(self):
        self.validate_required(self.right_scope, 'right_scope')
        self.validate_required(self.right_obtain_way, 'right_obtain_way')
        self.validate_required(self.ownership_way, 'ownership_way')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.right_scope is not None:
            result['right_scope'] = self.right_scope
        if self.right_obtain_way is not None:
            result['right_obtain_way'] = self.right_obtain_way
        if self.ownership_way is not None:
            result['ownership_way'] = self.ownership_way
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('right_scope') is not None:
            self.right_scope = m.get('right_scope')
        if m.get('right_obtain_way') is not None:
            self.right_obtain_way = m.get('right_obtain_way')
        if m.get('ownership_way') is not None:
            self.ownership_way = m.get('ownership_way')
        return self


class MonitorResult(TeaModel):
    def __init__(
        self,
        monitor_task_id: str = None,
        monitor_result_id: str = None,
        infr_url: str = None,
        infr_host: str = None,
        infr_title: str = None,
        infr_time: int = None,
        detail: str = None,
        poster: str = None,
        post_date: int = None,
        find_date: int = None,
        view_count: int = None,
        like_count: int = None,
        comment_count: int = None,
        repost_count: int = None,
        download_url: str = None,
        infr_feedback_time: int = None,
    ):
        # 监测任务ID
        # 
        self.monitor_task_id = monitor_task_id
        # 监测结果ID
        # 
        self.monitor_result_id = monitor_result_id
        # 侵权网址
        # 
        # 
        self.infr_url = infr_url
        # 侵权主体
        # 
        # 
        self.infr_host = infr_host
        # 侵权标题
        # 
        # 
        self.infr_title = infr_title
        # 侵权内容上传时间
        # 
        # 
        self.infr_time = infr_time
        # 侵权详情
        # 
        self.detail = detail
        # 发布者
        self.poster = poster
        # 侵权内容发布时间
        self.post_date = post_date
        # 侵权内容发现时间
        self.find_date = find_date
        # 观看数
        self.view_count = view_count
        # 点赞数
        self.like_count = like_count
        # 评论数
        self.comment_count = comment_count
        # 转发数
        self.repost_count = repost_count
        # 侵权文件下载链接
        self.download_url = download_url
        # 疑似侵权反馈时间
        self.infr_feedback_time = infr_feedback_time

    def validate(self):
        self.validate_required(self.monitor_task_id, 'monitor_task_id')
        self.validate_required(self.monitor_result_id, 'monitor_result_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.monitor_result_id is not None:
            result['monitor_result_id'] = self.monitor_result_id
        if self.infr_url is not None:
            result['infr_url'] = self.infr_url
        if self.infr_host is not None:
            result['infr_host'] = self.infr_host
        if self.infr_title is not None:
            result['infr_title'] = self.infr_title
        if self.infr_time is not None:
            result['infr_time'] = self.infr_time
        if self.detail is not None:
            result['detail'] = self.detail
        if self.poster is not None:
            result['poster'] = self.poster
        if self.post_date is not None:
            result['post_date'] = self.post_date
        if self.find_date is not None:
            result['find_date'] = self.find_date
        if self.view_count is not None:
            result['view_count'] = self.view_count
        if self.like_count is not None:
            result['like_count'] = self.like_count
        if self.comment_count is not None:
            result['comment_count'] = self.comment_count
        if self.repost_count is not None:
            result['repost_count'] = self.repost_count
        if self.download_url is not None:
            result['download_url'] = self.download_url
        if self.infr_feedback_time is not None:
            result['infr_feedback_time'] = self.infr_feedback_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('monitor_result_id') is not None:
            self.monitor_result_id = m.get('monitor_result_id')
        if m.get('infr_url') is not None:
            self.infr_url = m.get('infr_url')
        if m.get('infr_host') is not None:
            self.infr_host = m.get('infr_host')
        if m.get('infr_title') is not None:
            self.infr_title = m.get('infr_title')
        if m.get('infr_time') is not None:
            self.infr_time = m.get('infr_time')
        if m.get('detail') is not None:
            self.detail = m.get('detail')
        if m.get('poster') is not None:
            self.poster = m.get('poster')
        if m.get('post_date') is not None:
            self.post_date = m.get('post_date')
        if m.get('find_date') is not None:
            self.find_date = m.get('find_date')
        if m.get('view_count') is not None:
            self.view_count = m.get('view_count')
        if m.get('like_count') is not None:
            self.like_count = m.get('like_count')
        if m.get('comment_count') is not None:
            self.comment_count = m.get('comment_count')
        if m.get('repost_count') is not None:
            self.repost_count = m.get('repost_count')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        if m.get('infr_feedback_time') is not None:
            self.infr_feedback_time = m.get('infr_feedback_time')
        return self


class UserData(TeaModel):
    def __init__(
        self,
        account: str = None,
        account_type: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        contact_info: str = None,
        legal_person: str = None,
        reg_time: int = None,
        status: str = None,
        type: str = None,
    ):
        # 用户账号
        self.account = account
        # 账号类型
        self.account_type = account_type
        # 证件名称
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 联系方式
        self.contact_info = contact_info
        # 企业法人
        self.legal_person = legal_person
        # 注册时间
        self.reg_time = reg_time
        # 账号状态
        self.status = status
        # 用户类型
        self.type = type

    def validate(self):
        self.validate_required(self.account, 'account')
        self.validate_required(self.account_type, 'account_type')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.reg_time, 'reg_time')
        self.validate_required(self.status, 'status')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account is not None:
            result['account'] = self.account
        if self.account_type is not None:
            result['account_type'] = self.account_type
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.contact_info is not None:
            result['contact_info'] = self.contact_info
        if self.legal_person is not None:
            result['legal_person'] = self.legal_person
        if self.reg_time is not None:
            result['reg_time'] = self.reg_time
        if self.status is not None:
            result['status'] = self.status
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('account_type') is not None:
            self.account_type = m.get('account_type')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('contact_info') is not None:
            self.contact_info = m.get('contact_info')
        if m.get('legal_person') is not None:
            self.legal_person = m.get('legal_person')
        if m.get('reg_time') is not None:
            self.reg_time = m.get('reg_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class MonitorType(TeaModel):
    def __init__(
        self,
        file_type: str = None,
        submit_type: str = None,
    ):
        # 文件类型
        self.file_type = file_type
        # 提交类型
        self.submit_type = submit_type

    def validate(self):
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.submit_type, 'submit_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.submit_type is not None:
            result['submit_type'] = self.submit_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('submit_type') is not None:
            self.submit_type = m.get('submit_type')
        return self


class DayStatisticsInfo(TeaModel):
    def __init__(
        self,
        date: int = None,
        day_views: str = None,
        day_view_duration: str = None,
        day_average_view_duration: str = None,
        revenue: str = None,
    ):
        # 日期时间戳
        self.date = date
        # 日观看次数
        self.day_views = day_views
        # 日观看时长
        self.day_view_duration = day_view_duration
        # 日平均观看时长
        self.day_average_view_duration = day_average_view_duration
        # 日预计收入
        self.revenue = revenue

    def validate(self):
        self.validate_required(self.date, 'date')
        self.validate_required(self.day_views, 'day_views')
        self.validate_required(self.day_view_duration, 'day_view_duration')
        self.validate_required(self.day_average_view_duration, 'day_average_view_duration')
        self.validate_required(self.revenue, 'revenue')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.date is not None:
            result['date'] = self.date
        if self.day_views is not None:
            result['day_views'] = self.day_views
        if self.day_view_duration is not None:
            result['day_view_duration'] = self.day_view_duration
        if self.day_average_view_duration is not None:
            result['day_average_view_duration'] = self.day_average_view_duration
        if self.revenue is not None:
            result['revenue'] = self.revenue
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('day_views') is not None:
            self.day_views = m.get('day_views')
        if m.get('day_view_duration') is not None:
            self.day_view_duration = m.get('day_view_duration')
        if m.get('day_average_view_duration') is not None:
            self.day_average_view_duration = m.get('day_average_view_duration')
        if m.get('revenue') is not None:
            self.revenue = m.get('revenue')
        return self


class GetUploadurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_name: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件名称
        self.file_name = file_name
        # 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.file_name, 'file_name')
        if self.file_name is not None:
            self.validate_max_length(self.file_name, 'file_name', 128)
        if self.client_token is not None:
            self.validate_max_length(self.client_token, 'client_token', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class GetUploadurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
        file_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权访问oss链接
        self.url = url
        # OSS 文件id
        self.file_id = file_id

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
        if self.url is not None:
            result['url'] = self.url
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class AddHashregisterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        hash: str = None,
        length: int = None,
        hash_type: str = None,
        type: str = None,
        name: str = None,
        memo: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        create_certificate: bool = None,
        certificate_type: str = None,
        create_package: bool = None,
        org_id: str = None,
        phone_num: str = None,
        works_info: WorksInfo = None,
        create_statement: bool = None,
        rights_info: RightsInfo = None,
        manager_name: str = None,
        manager_no: str = None,
        ancillary_evidence: List[str] = None,
        copyright_owner_info: CopyrightCertInfo = None,
        client_token: str = None,
        feature_file_id: str = None,
        proxy_info: ProxyData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件SHA256 hash
        self.hash = hash
        # 文件大小
        self.length = length
        # hash算法
        self.hash_type = hash_type
        # 文件类型
        self.type = type
        # 文件名称
        self.name = name
        # 备注
        self.memo = memo
        # 证件名称
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 是否自动创建公证保管函
        self.create_certificate = create_certificate
        # 证书类型
        self.certificate_type = certificate_type
        # 是否创建证据包，默认否
        self.create_package = create_package
        # 
        # 公证处Id
        self.org_id = org_id
        # 电话号码
        self.phone_num = phone_num
        # 作品信息
        self.works_info = works_info
        # 是否创建权利声明书（默认否，选是需要rightsInfo传递对应信息）
        self.create_statement = create_statement
        # 权利信息
        self.rights_info = rights_info
        # 企业经办人姓名（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
        self.manager_name = manager_name
        # 企业经办人身份证号（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
        self.manager_no = manager_no
        # 附属证据信息（最多5个文件，传递的是FileId）
        self.ancillary_evidence = ancillary_evidence
        # 著作权人信息
        self.copyright_owner_info = copyright_owner_info
        # 幂等字段
        self.client_token = client_token
        # 特征文件oss id
        self.feature_file_id = feature_file_id
        # 代理信息
        self.proxy_info = proxy_info

    def validate(self):
        self.validate_required(self.hash, 'hash')
        self.validate_required(self.length, 'length')
        self.validate_required(self.hash_type, 'hash_type')
        self.validate_required(self.type, 'type')
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 128)
        if self.memo is not None:
            self.validate_max_length(self.memo, 'memo', 512)
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        if self.works_info:
            self.works_info.validate()
        if self.rights_info:
            self.rights_info.validate()
        if self.manager_name is not None:
            self.validate_max_length(self.manager_name, 'manager_name', 32)
        if self.manager_no is not None:
            self.validate_max_length(self.manager_no, 'manager_no', 30)
        if self.copyright_owner_info:
            self.copyright_owner_info.validate()
        if self.proxy_info:
            self.proxy_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.hash is not None:
            result['hash'] = self.hash
        if self.length is not None:
            result['length'] = self.length
        if self.hash_type is not None:
            result['hash_type'] = self.hash_type
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        if self.memo is not None:
            result['memo'] = self.memo
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.create_certificate is not None:
            result['create_certificate'] = self.create_certificate
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.create_package is not None:
            result['create_package'] = self.create_package
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.works_info is not None:
            result['works_info'] = self.works_info.to_map()
        if self.create_statement is not None:
            result['create_statement'] = self.create_statement
        if self.rights_info is not None:
            result['rights_info'] = self.rights_info.to_map()
        if self.manager_name is not None:
            result['manager_name'] = self.manager_name
        if self.manager_no is not None:
            result['manager_no'] = self.manager_no
        if self.ancillary_evidence is not None:
            result['ancillary_evidence'] = self.ancillary_evidence
        if self.copyright_owner_info is not None:
            result['copyright_owner_info'] = self.copyright_owner_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.feature_file_id is not None:
            result['feature_file_id'] = self.feature_file_id
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('length') is not None:
            self.length = m.get('length')
        if m.get('hash_type') is not None:
            self.hash_type = m.get('hash_type')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('create_certificate') is not None:
            self.create_certificate = m.get('create_certificate')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('create_package') is not None:
            self.create_package = m.get('create_package')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('works_info') is not None:
            temp_model = WorksInfo()
            self.works_info = temp_model.from_map(m['works_info'])
        if m.get('create_statement') is not None:
            self.create_statement = m.get('create_statement')
        if m.get('rights_info') is not None:
            temp_model = RightsInfo()
            self.rights_info = temp_model.from_map(m['rights_info'])
        if m.get('manager_name') is not None:
            self.manager_name = m.get('manager_name')
        if m.get('manager_no') is not None:
            self.manager_no = m.get('manager_no')
        if m.get('ancillary_evidence') is not None:
            self.ancillary_evidence = m.get('ancillary_evidence')
        if m.get('copyright_owner_info') is not None:
            temp_model = CopyrightCertInfo()
            self.copyright_owner_info = temp_model.from_map(m['copyright_owner_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('feature_file_id') is not None:
            self.feature_file_id = m.get('feature_file_id')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        return self


class AddHashregisterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        register_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 登记id
        self.register_id = register_id

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
        if self.register_id is not None:
            result['register_id'] = self.register_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        return self


class AddRegisterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_id: str = None,
        create_certificate: bool = None,
        certificate_type: str = None,
        create_package: bool = None,
        org_id: str = None,
        name: str = None,
        type: str = None,
        memo: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        phone_num: str = None,
        works_info: WorksInfo = None,
        create_statement: bool = None,
        manager_name: str = None,
        manager_no: str = None,
        rights_info: RightsInfo = None,
        ancillary_evidence: List[str] = None,
        copyright_owner_info: CopyrightCertInfo = None,
        client_token: str = None,
        sync_info: AccountData = None,
        proxy_info: ProxyData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件oss id
        self.file_id = file_id
        # 是否自动创建公证书,默认否
        self.create_certificate = create_certificate
        # 证书类型
        self.certificate_type = certificate_type
        # 是否创建证据包，默认否
        self.create_package = create_package
        # 公证处id
        self.org_id = org_id
        # 文件名称
        self.name = name
        # 文件类型
        self.type = type
        # 备注
        self.memo = memo
        # 证件名称
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 电话号码
        self.phone_num = phone_num
        # 作品信息
        self.works_info = works_info
        # 是否创建权利声明书（默认否，选是需要rightsInfo传递对应信息）
        self.create_statement = create_statement
        # 企业经办人姓名（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
        self.manager_name = manager_name
        # 企业经办人身份证号（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
        self.manager_no = manager_no
        # 权利信息
        self.rights_info = rights_info
        # 附属证据信息（最多5个文件，传递的是FileId）
        self.ancillary_evidence = ancillary_evidence
        # 著作权人信息
        self.copyright_owner_info = copyright_owner_info
        # 幂等
        self.client_token = client_token
        # 同步账号信息
        self.sync_info = sync_info
        # 代理信息
        self.proxy_info = proxy_info

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 128)
        self.validate_required(self.type, 'type')
        if self.memo is not None:
            self.validate_max_length(self.memo, 'memo', 512)
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        if self.works_info:
            self.works_info.validate()
        if self.manager_name is not None:
            self.validate_max_length(self.manager_name, 'manager_name', 32)
        if self.manager_no is not None:
            self.validate_max_length(self.manager_no, 'manager_no', 30)
        if self.rights_info:
            self.rights_info.validate()
        if self.copyright_owner_info:
            self.copyright_owner_info.validate()
        if self.sync_info:
            self.sync_info.validate()
        if self.proxy_info:
            self.proxy_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.create_certificate is not None:
            result['create_certificate'] = self.create_certificate
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.create_package is not None:
            result['create_package'] = self.create_package
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.memo is not None:
            result['memo'] = self.memo
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.works_info is not None:
            result['works_info'] = self.works_info.to_map()
        if self.create_statement is not None:
            result['create_statement'] = self.create_statement
        if self.manager_name is not None:
            result['manager_name'] = self.manager_name
        if self.manager_no is not None:
            result['manager_no'] = self.manager_no
        if self.rights_info is not None:
            result['rights_info'] = self.rights_info.to_map()
        if self.ancillary_evidence is not None:
            result['ancillary_evidence'] = self.ancillary_evidence
        if self.copyright_owner_info is not None:
            result['copyright_owner_info'] = self.copyright_owner_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.sync_info is not None:
            result['sync_info'] = self.sync_info.to_map()
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('create_certificate') is not None:
            self.create_certificate = m.get('create_certificate')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('create_package') is not None:
            self.create_package = m.get('create_package')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('works_info') is not None:
            temp_model = WorksInfo()
            self.works_info = temp_model.from_map(m['works_info'])
        if m.get('create_statement') is not None:
            self.create_statement = m.get('create_statement')
        if m.get('manager_name') is not None:
            self.manager_name = m.get('manager_name')
        if m.get('manager_no') is not None:
            self.manager_no = m.get('manager_no')
        if m.get('rights_info') is not None:
            temp_model = RightsInfo()
            self.rights_info = temp_model.from_map(m['rights_info'])
        if m.get('ancillary_evidence') is not None:
            self.ancillary_evidence = m.get('ancillary_evidence')
        if m.get('copyright_owner_info') is not None:
            temp_model = CopyrightCertInfo()
            self.copyright_owner_info = temp_model.from_map(m['copyright_owner_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('sync_info') is not None:
            temp_model = AccountData()
            self.sync_info = temp_model.from_map(m['sync_info'])
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        return self


class AddRegisterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        register_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 登记id
        self.register_id = register_id

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
        if self.register_id is not None:
            result['register_id'] = self.register_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        return self


class QueryRegisterstatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        register_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 登记id
        self.register_id = register_id

    def validate(self):
        self.validate_required(self.register_id, 'register_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.register_id is not None:
            result['register_id'] = self.register_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        return self


class QueryRegisterstatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        timestamp: int = None,
        hash: str = None,
        tx_hash: str = None,
        block_height: int = None,
        tsr: str = None,
        certificate_url: str = None,
        certificate_storage_no: str = None,
        certificate_time_url: str = None,
        package_url: str = None,
        package_tx_hash: str = None,
        statement_url: str = None,
        security: SecurityData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 登记状态
        self.status = status
        # 存证时间
        self.timestamp = timestamp
        # 文件hash
        self.hash = hash
        # 统一证据编号（存证交易HASH）
        self.tx_hash = tx_hash
        # 存证块高
        self.block_height = block_height
        # tsr信息
        self.tsr = tsr
        # 公证处证书下载链接
        self.certificate_url = certificate_url
        # 公证处证书编号
        self.certificate_storage_no = certificate_storage_no
        # 授时中心证书下载链接
        self.certificate_time_url = certificate_time_url
        # 证据包下载地址（状态为SUCCESS并且请求要求生成证据包才有数据）
        self.package_url = package_url
        # 证据包存证交易HASH  注意只有生成了证据包才会返回
        self.package_tx_hash = package_tx_hash
        # 权利声明书下载地址 注意只有传递了权利信息并且生成了权利声明书才会返回
        self.statement_url = statement_url
        # 安全信息
        self.security = security

    def validate(self):
        if self.security:
            self.security.validate()

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
        if self.status is not None:
            result['status'] = self.status
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.hash is not None:
            result['hash'] = self.hash
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.tsr is not None:
            result['tsr'] = self.tsr
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        if self.certificate_storage_no is not None:
            result['certificate_storage_no'] = self.certificate_storage_no
        if self.certificate_time_url is not None:
            result['certificate_time_url'] = self.certificate_time_url
        if self.package_url is not None:
            result['package_url'] = self.package_url
        if self.package_tx_hash is not None:
            result['package_tx_hash'] = self.package_tx_hash
        if self.statement_url is not None:
            result['statement_url'] = self.statement_url
        if self.security is not None:
            result['security'] = self.security.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('tsr') is not None:
            self.tsr = m.get('tsr')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        if m.get('certificate_storage_no') is not None:
            self.certificate_storage_no = m.get('certificate_storage_no')
        if m.get('certificate_time_url') is not None:
            self.certificate_time_url = m.get('certificate_time_url')
        if m.get('package_url') is not None:
            self.package_url = m.get('package_url')
        if m.get('package_tx_hash') is not None:
            self.package_tx_hash = m.get('package_tx_hash')
        if m.get('statement_url') is not None:
            self.statement_url = m.get('statement_url')
        if m.get('security') is not None:
            temp_model = SecurityData()
            self.security = temp_model.from_map(m['security'])
        return self


class CreateCertificateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        register_id: str = None,
        certificate_type: str = None,
        features_type: str = None,
        org_id: str = None,
        proxy_info: ProxyData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 版权登记id
        self.register_id = register_id
        # 证书类型
        self.certificate_type = certificate_type
        # 功能类型
        self.features_type = features_type
        # 公证处id
        self.org_id = org_id
        # 代理信息
        self.proxy_info = proxy_info

    def validate(self):
        self.validate_required(self.register_id, 'register_id')
        self.validate_required(self.certificate_type, 'certificate_type')
        self.validate_required(self.features_type, 'features_type')
        if self.proxy_info:
            self.proxy_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.register_id is not None:
            result['register_id'] = self.register_id
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.features_type is not None:
            result['features_type'] = self.features_type
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('features_type') is not None:
            self.features_type = m.get('features_type')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        return self


class CreateCertificateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成证书结果
        self.status = status

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
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class GetCertificateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certificate_type: str = None,
        features_type: str = None,
        register_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 证书类型
        self.certificate_type = certificate_type
        # 功能类型
        self.features_type = features_type
        # 版权登记id
        self.register_id = register_id

    def validate(self):
        self.validate_required(self.certificate_type, 'certificate_type')
        self.validate_required(self.features_type, 'features_type')
        self.validate_required(self.register_id, 'register_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.features_type is not None:
            result['features_type'] = self.features_type
        if self.register_id is not None:
            result['register_id'] = self.register_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('features_type') is not None:
            self.features_type = m.get('features_type')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        return self


class GetCertificateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证书下载链接
        self.url = url
        # 证书生成状态
        self.status = status

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
        if self.url is not None:
            result['url'] = self.url
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class CreateMonitorTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        submit_content: str = None,
        submit_type: str = None,
        file_type: str = None,
        task_name: str = None,
        content_title: str = None,
        keywords: List[str] = None,
        content_desc: str = None,
        provider_id: str = None,
        scopes: List[str] = None,
        task_start: int = None,
        task_duration: int = None,
        proxy_info: ProxyData = None,
        client_token: str = None,
        origin_monitor_task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # submitType是url就传 url地址 submitType 是file就传 oss fileId
        self.submit_content = submit_content
        # 提交任务的类型:FILE/URL
        # 不填为FILE
        # FILE表示文件上传素材，URL表示上传URL
        self.submit_type = submit_type
        # 文件类别
        # 
        # IMAGE
        # 
        # TEXT
        # 
        # VIDEO
        self.file_type = file_type
        # 任务名称(不超过100字符)
        self.task_name = task_name
        # 监测任务标题(不超过100字符)
        self.content_title = content_title
        # 关键词(不超过200字符)
        self.keywords = keywords
        # 内容表述(不超过1000字符)
        self.content_desc = content_desc
        # 监测供应商id
        self.provider_id = provider_id
        # 监测范围 默认全部：ALL；PC网站：SITE；APP应用：APP
        self.scopes = scopes
        # 任务开始时间，如当前时间戳，不传则取服务器当前时间戳，单位毫秒
        self.task_start = task_start
        # 任务持续时间，单位天，默认90天
        # 
        # 一次性监测：0
        self.task_duration = task_duration
        # 代理信息
        self.proxy_info = proxy_info
        # 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        self.client_token = client_token
        # 原监测任务id
        self.origin_monitor_task_id = origin_monitor_task_id

    def validate(self):
        self.validate_required(self.submit_content, 'submit_content')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.task_name, 'task_name')
        self.validate_required(self.content_title, 'content_title')
        self.validate_required(self.keywords, 'keywords')
        if self.proxy_info:
            self.proxy_info.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.submit_content is not None:
            result['submit_content'] = self.submit_content
        if self.submit_type is not None:
            result['submit_type'] = self.submit_type
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.content_title is not None:
            result['content_title'] = self.content_title
        if self.keywords is not None:
            result['keywords'] = self.keywords
        if self.content_desc is not None:
            result['content_desc'] = self.content_desc
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.scopes is not None:
            result['scopes'] = self.scopes
        if self.task_start is not None:
            result['task_start'] = self.task_start
        if self.task_duration is not None:
            result['task_duration'] = self.task_duration
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.origin_monitor_task_id is not None:
            result['origin_monitor_task_id'] = self.origin_monitor_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('submit_content') is not None:
            self.submit_content = m.get('submit_content')
        if m.get('submit_type') is not None:
            self.submit_type = m.get('submit_type')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('content_title') is not None:
            self.content_title = m.get('content_title')
        if m.get('keywords') is not None:
            self.keywords = m.get('keywords')
        if m.get('content_desc') is not None:
            self.content_desc = m.get('content_desc')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('scopes') is not None:
            self.scopes = m.get('scopes')
        if m.get('task_start') is not None:
            self.task_start = m.get('task_start')
        if m.get('task_duration') is not None:
            self.task_duration = m.get('task_duration')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('origin_monitor_task_id') is not None:
            self.origin_monitor_task_id = m.get('origin_monitor_task_id')
        return self


class CreateMonitorTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        monitor_task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测任务Id
        self.monitor_task_id = monitor_task_id

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
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        return self


class StopMonitorTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        monitor_task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 监测任务Id
        # 
        self.monitor_task_id = monitor_task_id

    def validate(self):
        self.validate_required(self.monitor_task_id, 'monitor_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        return self


class StopMonitorTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 停止结果
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


class QueryMonitorTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        monitor_task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 监测任务Id
        # 
        self.monitor_task_id = monitor_task_id

    def validate(self):
        self.validate_required(self.monitor_task_id, 'monitor_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        return self


class QueryMonitorTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        monitor_task: MonitorTask = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测任务信息
        # 
        # 
        self.monitor_task = monitor_task

    def validate(self):
        if self.monitor_task:
            self.monitor_task.validate()

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
        if self.monitor_task is not None:
            result['monitor_task'] = self.monitor_task.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('monitor_task') is not None:
            temp_model = MonitorTask()
            self.monitor_task = temp_model.from_map(m['monitor_task'])
        return self


class QueryMonitorResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        monitor_task_id: str = None,
        page_index: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 监测任务Id
        self.monitor_task_id = monitor_task_id
        # 页序号(>0)
        # 
        # 
        self.page_index = page_index
        # 页大小(1-200)
        # 
        # 
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.monitor_task_id, 'monitor_task_id')
        self.validate_required(self.page_index, 'page_index')
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
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryMonitorResultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        monitor_result_list: List[MonitorResult] = None,
        page_index: int = None,
        page_size: int = None,
        result_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测任务信息
        self.monitor_result_list = monitor_result_list
        # 页序号(>0)
        self.page_index = page_index
        # 页大小(1-200)
        self.page_size = page_size
        # 监测结果数量
        self.result_count = result_count

    def validate(self):
        if self.monitor_result_list:
            for k in self.monitor_result_list:
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
        result['monitor_result_list'] = []
        if self.monitor_result_list is not None:
            for k in self.monitor_result_list:
                result['monitor_result_list'].append(k.to_map() if k else None)
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.result_count is not None:
            result['result_count'] = self.result_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.monitor_result_list = []
        if m.get('monitor_result_list') is not None:
            for k in m.get('monitor_result_list'):
                temp_model = MonitorResult()
                self.monitor_result_list.append(temp_model.from_map(k))
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('result_count') is not None:
            self.result_count = m.get('result_count')
        return self


class ListMonitorProviderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        monitor_types: List[MonitorType] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需监测文件类型
        self.monitor_types = monitor_types

    def validate(self):
        self.validate_required(self.monitor_types, 'monitor_types')
        if self.monitor_types:
            for k in self.monitor_types:
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
        result['monitor_types'] = []
        if self.monitor_types is not None:
            for k in self.monitor_types:
                result['monitor_types'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.monitor_types = []
        if m.get('monitor_types') is not None:
            for k in m.get('monitor_types'):
                temp_model = MonitorType()
                self.monitor_types.append(temp_model.from_map(k))
        return self


class ListMonitorProviderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        provider_list: List[MonitorProviderType] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测能力提供方类型列表
        self.provider_list = provider_list

    def validate(self):
        if self.provider_list:
            for k in self.provider_list:
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
        result['provider_list'] = []
        if self.provider_list is not None:
            for k in self.provider_list:
                result['provider_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.provider_list = []
        if m.get('provider_list') is not None:
            for k in m.get('provider_list'):
                temp_model = MonitorProviderType()
                self.provider_list.append(temp_model.from_map(k))
        return self


class CreateRecodescreenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        memo: str = None,
        url: List[str] = None,
        type: str = None,
        area: str = None,
        screen_code: str = None,
        max_time_in_min: int = None,
        wait_in_min: int = None,
        cross_region: str = None,
        ip_type: str = None,
        callback_url: str = None,
        org_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        legal_person_name: str = None,
        legal_person_no: str = None,
        agent: str = None,
        agent_no: str = None,
        phone_num: str = None,
        proxy_info: ProxyData = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证名称（最长128个字符）
        self.name = name
        # 取证备注（最长512个字符）
        self.memo = memo
        # 预校验网址和预打开网页（不能大于10条）
        self.url = url
        # 取证类型 具体见附录 RecordScreenType
        self.type = type
        # 取证服务器地域 具体见附录 RecordScreenArea
        self.area = area
        # 定制录屏桌面识别码，目前取值只有默认值：DEFAULT
        self.screen_code = screen_code
        # 最大录屏时间，maxTimeInMin不能小于6min，不能大于300min
        self.max_time_in_min = max_time_in_min
        # 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
        self.wait_in_min = wait_in_min
        # 当所选地域无机器资源时，是否使用其它地域
        # 
        # 目前取值只有默认值：FORBID
        self.cross_region = cross_region
        # ip地域取值
        # 
        # 目前取值只有默认值：ANY
        self.ip_type = ip_type
        # 回调地址
        self.callback_url = callback_url
        # 公证处Id
        self.org_id = org_id
        # 取证人证件名称
        self.cert_name = cert_name
        # 
        # 取证人证件号码
        self.cert_no = cert_no
        # 取证人证件类型 具体见附录CertType
        self.cert_type = cert_type
        # 企业法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_name = legal_person_name
        # 企业法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_no = legal_person_no
        # 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.agent = agent
        # 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_no = agent_no
        # 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630   或  (86)13738258505
        self.phone_num = phone_num
        # 代理信息
        self.proxy_info = proxy_info
        # 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 128)
        if self.memo is not None:
            self.validate_max_length(self.memo, 'memo', 512)
        self.validate_required(self.type, 'type')
        self.validate_required(self.area, 'area')
        self.validate_required(self.max_time_in_min, 'max_time_in_min')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        if self.proxy_info:
            self.proxy_info.validate()
        self.validate_required(self.client_token, 'client_token')

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
        if self.memo is not None:
            result['memo'] = self.memo
        if self.url is not None:
            result['url'] = self.url
        if self.type is not None:
            result['type'] = self.type
        if self.area is not None:
            result['area'] = self.area
        if self.screen_code is not None:
            result['screen_code'] = self.screen_code
        if self.max_time_in_min is not None:
            result['max_time_in_min'] = self.max_time_in_min
        if self.wait_in_min is not None:
            result['wait_in_min'] = self.wait_in_min
        if self.cross_region is not None:
            result['cross_region'] = self.cross_region
        if self.ip_type is not None:
            result['ip_type'] = self.ip_type
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.legal_person_name is not None:
            result['legal_person_name'] = self.legal_person_name
        if self.legal_person_no is not None:
            result['legal_person_no'] = self.legal_person_no
        if self.agent is not None:
            result['agent'] = self.agent
        if self.agent_no is not None:
            result['agent_no'] = self.agent_no
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('area') is not None:
            self.area = m.get('area')
        if m.get('screen_code') is not None:
            self.screen_code = m.get('screen_code')
        if m.get('max_time_in_min') is not None:
            self.max_time_in_min = m.get('max_time_in_min')
        if m.get('wait_in_min') is not None:
            self.wait_in_min = m.get('wait_in_min')
        if m.get('cross_region') is not None:
            self.cross_region = m.get('cross_region')
        if m.get('ip_type') is not None:
            self.ip_type = m.get('ip_type')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('legal_person_name') is not None:
            self.legal_person_name = m.get('legal_person_name')
        if m.get('legal_person_no') is not None:
            self.legal_person_no = m.get('legal_person_no')
        if m.get('agent') is not None:
            self.agent = m.get('agent')
        if m.get('agent_no') is not None:
            self.agent_no = m.get('agent_no')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateRecodescreenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id

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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryRecodescreenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证id
        self.evidence_id = evidence_id

    def validate(self):
        self.validate_required(self.evidence_id, 'evidence_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryRecodescreenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
        status: str = None,
        operate_url: str = None,
        data: RecordScreenData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id
        # 取证状态 具体见附录 RecordScreenStatus
        self.status = status
        # 取证操作Url （状态为INIT和DOING 时返回 可以重复打开使用）
        self.operate_url = operate_url
        # 取证详情（状态为PACKAGING,SUCCESS,FAIL才有数据）
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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        if self.status is not None:
            result['status'] = self.status
        if self.operate_url is not None:
            result['operate_url'] = self.operate_url
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
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('operate_url') is not None:
            self.operate_url = m.get('operate_url')
        if m.get('data') is not None:
            temp_model = RecordScreenData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户token，从cookie或者重定向链接获取
        self.token = token

    def validate(self):
        self.validate_required(self.token, 'token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QueryUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        login: bool = None,
        user: UserData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否登录
        self.login = login
        # 用户信息
        self.user = user

    def validate(self):
        if self.user:
            self.user.validate()

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
        if self.login is not None:
            result['login'] = self.login
        if self.user is not None:
            result['user'] = self.user.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('login') is not None:
            self.login = m.get('login')
        if m.get('user') is not None:
            temp_model = UserData()
            self.user = temp_model.from_map(m['user'])
        return self


class QueryUserListRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_index: int = None,
        page_size: int = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页码，从1开始
        self.page_index = page_index
        # 每页数据，1~100
        self.page_size = page_size
        # 用户状态
        self.status = status

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
        if self.page_index is not None:
            self.validate_minimum(self.page_index, 'page_index', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
            self.validate_minimum(self.page_size, 'page_size', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryUserListResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_index: int = None,
        page_size: int = None,
        total_count: int = None,
        user_list: List[UserData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码，从1开始
        self.page_index = page_index
        # 每页数据，1~100
        self.page_size = page_size
        # 总数量
        self.total_count = total_count
        # 用户信息列表
        self.user_list = user_list

    def validate(self):
        if self.user_list:
            for k in self.user_list:
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
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['user_list'] = []
        if self.user_list is not None:
            for k in self.user_list:
                result['user_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.user_list = []
        if m.get('user_list') is not None:
            for k in m.get('user_list'):
                temp_model = UserData()
                self.user_list.append(temp_model.from_map(k))
        return self


class CreateScreenshotRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        memo: str = None,
        url: str = None,
        org_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        legal_person_name: str = None,
        legal_person_no: str = None,
        legal_person_type: str = None,
        agent_name: str = None,
        agent_no: str = None,
        phone_num: str = None,
        proxy_info: ProxyData = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证名称（最长128个字符）
        self.name = name
        # 取证备注（最长512个字符）
        self.memo = memo
        # 取证地址（最长2048个字符）
        self.url = url
        # 公证处Id
        self.org_id = org_id
        # 取证人证件名称
        self.cert_name = cert_name
        # 取证人证件号码
        self.cert_no = cert_no
        # 取证人证件类型
        self.cert_type = cert_type
        # 法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_name = legal_person_name
        # 法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_no = legal_person_no
        # 法人证件类型
        self.legal_person_type = legal_person_type
        # 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_name = agent_name
        # 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_no = agent_no
        # 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630   或  (86)13738258505
        self.phone_num = phone_num
        # 代理信息
        self.proxy_info = proxy_info
        # 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 128)
        if self.memo is not None:
            self.validate_max_length(self.memo, 'memo', 512)
        self.validate_required(self.url, 'url')
        if self.url is not None:
            self.validate_max_length(self.url, 'url', 2048)
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        if self.proxy_info:
            self.proxy_info.validate()
        self.validate_required(self.client_token, 'client_token')
        if self.client_token is not None:
            self.validate_max_length(self.client_token, 'client_token', 64)

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
        if self.memo is not None:
            result['memo'] = self.memo
        if self.url is not None:
            result['url'] = self.url
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.legal_person_name is not None:
            result['legal_person_name'] = self.legal_person_name
        if self.legal_person_no is not None:
            result['legal_person_no'] = self.legal_person_no
        if self.legal_person_type is not None:
            result['legal_person_type'] = self.legal_person_type
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        if self.agent_no is not None:
            result['agent_no'] = self.agent_no
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('legal_person_name') is not None:
            self.legal_person_name = m.get('legal_person_name')
        if m.get('legal_person_no') is not None:
            self.legal_person_no = m.get('legal_person_no')
        if m.get('legal_person_type') is not None:
            self.legal_person_type = m.get('legal_person_type')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        if m.get('agent_no') is not None:
            self.agent_no = m.get('agent_no')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateScreenshotResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id

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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryScreenshotRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证id
        self.evidence_id = evidence_id

    def validate(self):
        self.validate_required(self.evidence_id, 'evidence_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryScreenshotResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
        status: str = None,
        data: ScreenshotData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id
        # 取证状态
        self.status = status
        # 网页截图信息
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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data') is not None:
            temp_model = ScreenshotData()
            self.data = temp_model.from_map(m['data'])
        return self


class VerifyBlockchainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tx_hash: str = None,
        file_hash: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 统一证据编号（存证交易HASH）
        self.tx_hash = tx_hash
        # 文件HASH，使用HEX的完整表示，如 6460c949f8a347eb...
        # 
        # (和fileId 二选一，必传一个，都传按fileHash为准)
        self.file_hash = file_hash

    def validate(self):
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        return self


class VerifyBlockchainResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        status: str = None,
        block_hash: str = None,
        block_height: int = None,
        data_type: str = None,
        timestamp: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 统一证据编号（存证交易HASH）
        self.tx_hash = tx_hash
        # 核验结果
        self.status = status
        # 所在区块hash
        self.block_hash = block_hash
        # 区块链高度
        self.block_height = block_height
        # 存证类型
        self.data_type = data_type
        # 存证时间
        self.timestamp = timestamp

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.status is not None:
            result['status'] = self.status
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class CreateRecordscreenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        memo: str = None,
        url: List[str] = None,
        type: str = None,
        area: str = None,
        screen_code: str = None,
        max_time_in_min: int = None,
        wait_in_min: int = None,
        cross_region: str = None,
        ip_type: str = None,
        callback_url: str = None,
        org_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        legal_person_name: str = None,
        legal_person_no: str = None,
        legal_person_type: str = None,
        agent_name: str = None,
        agent_no: str = None,
        phone_num: str = None,
        automatic: bool = None,
        target_type: str = None,
        support_uac: bool = None,
        scripts_package_id: str = None,
        proxy_info: ProxyData = None,
        client_token: str = None,
        inventory: str = None,
        audio_video_infos: List[EvidenceUrlInfo] = None,
        screen_cancel_info: ScreenCancelInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证名称（最长128个字符）
        self.name = name
        # 取证备注（最长512个字符）
        self.memo = memo
        # 预校验网址和预打开网页（不能大于10条），如果automatic为true 则必填
        self.url = url
        # 取证类型 具体见附录 RecordScreenType
        self.type = type
        # 取证服务器地域 具体见附录 RecordScreenArea
        self.area = area
        # 定制录屏桌面识别码，目前取值只有默认值：DEFAULT
        self.screen_code = screen_code
        # 最大录屏时间，maxTimeInMin不能小于6min，不能大于300min
        self.max_time_in_min = max_time_in_min
        # 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
        self.wait_in_min = wait_in_min
        # 当所选地域无机器资源时，是否使用其它地域 目前取值只有默认值：FORBID
        self.cross_region = cross_region
        # ip地域取值 目前取值只有默认值：ANY
        self.ip_type = ip_type
        # 回调地址
        self.callback_url = callback_url
        # 公证处Id
        self.org_id = org_id
        # 取证人证件名称
        self.cert_name = cert_name
        # 取证人证件号码
        self.cert_no = cert_no
        # 取证人证件类型 具体见附录CertType
        self.cert_type = cert_type
        # 企业法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_name = legal_person_name
        # 企业法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.legal_person_no = legal_person_no
        # 法人证件类型（非必传，默认IDENTITY_CARD）
        self.legal_person_type = legal_person_type
        # 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_name = agent_name
        # 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_no = agent_no
        # 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630 或 (86)13738258505
        self.phone_num = phone_num
        # 是否自动化取证
        self.automatic = automatic
        # 取证目标类型： 微信公众号：WEIXIN_MP 其它：OTHER
        # 
        self.target_type = target_type
        # 是否支持UAC通行 默认false
        self.support_uac = support_uac
        # 取证脚本集Id
        self.scripts_package_id = scripts_package_id
        # 代理信息
        self.proxy_info = proxy_info
        # 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        self.client_token = client_token
        # 其他取证网址
        self.inventory = inventory
        # 音视频取证信息
        self.audio_video_infos = audio_video_infos
        # 放弃取证信息
        self.screen_cancel_info = screen_cancel_info

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 128)
        if self.memo is not None:
            self.validate_max_length(self.memo, 'memo', 512)
        self.validate_required(self.type, 'type')
        self.validate_required(self.area, 'area')
        self.validate_required(self.max_time_in_min, 'max_time_in_min')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        if self.proxy_info:
            self.proxy_info.validate()
        self.validate_required(self.client_token, 'client_token')
        if self.audio_video_infos:
            for k in self.audio_video_infos:
                if k:
                    k.validate()
        if self.screen_cancel_info:
            self.screen_cancel_info.validate()

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
        if self.memo is not None:
            result['memo'] = self.memo
        if self.url is not None:
            result['url'] = self.url
        if self.type is not None:
            result['type'] = self.type
        if self.area is not None:
            result['area'] = self.area
        if self.screen_code is not None:
            result['screen_code'] = self.screen_code
        if self.max_time_in_min is not None:
            result['max_time_in_min'] = self.max_time_in_min
        if self.wait_in_min is not None:
            result['wait_in_min'] = self.wait_in_min
        if self.cross_region is not None:
            result['cross_region'] = self.cross_region
        if self.ip_type is not None:
            result['ip_type'] = self.ip_type
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.org_id is not None:
            result['org_id'] = self.org_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.legal_person_name is not None:
            result['legal_person_name'] = self.legal_person_name
        if self.legal_person_no is not None:
            result['legal_person_no'] = self.legal_person_no
        if self.legal_person_type is not None:
            result['legal_person_type'] = self.legal_person_type
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        if self.agent_no is not None:
            result['agent_no'] = self.agent_no
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.automatic is not None:
            result['automatic'] = self.automatic
        if self.target_type is not None:
            result['target_type'] = self.target_type
        if self.support_uac is not None:
            result['support_uac'] = self.support_uac
        if self.scripts_package_id is not None:
            result['scripts_package_id'] = self.scripts_package_id
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.inventory is not None:
            result['inventory'] = self.inventory
        result['audio_video_infos'] = []
        if self.audio_video_infos is not None:
            for k in self.audio_video_infos:
                result['audio_video_infos'].append(k.to_map() if k else None)
        if self.screen_cancel_info is not None:
            result['screen_cancel_info'] = self.screen_cancel_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('area') is not None:
            self.area = m.get('area')
        if m.get('screen_code') is not None:
            self.screen_code = m.get('screen_code')
        if m.get('max_time_in_min') is not None:
            self.max_time_in_min = m.get('max_time_in_min')
        if m.get('wait_in_min') is not None:
            self.wait_in_min = m.get('wait_in_min')
        if m.get('cross_region') is not None:
            self.cross_region = m.get('cross_region')
        if m.get('ip_type') is not None:
            self.ip_type = m.get('ip_type')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('org_id') is not None:
            self.org_id = m.get('org_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('legal_person_name') is not None:
            self.legal_person_name = m.get('legal_person_name')
        if m.get('legal_person_no') is not None:
            self.legal_person_no = m.get('legal_person_no')
        if m.get('legal_person_type') is not None:
            self.legal_person_type = m.get('legal_person_type')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        if m.get('agent_no') is not None:
            self.agent_no = m.get('agent_no')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('automatic') is not None:
            self.automatic = m.get('automatic')
        if m.get('target_type') is not None:
            self.target_type = m.get('target_type')
        if m.get('support_uac') is not None:
            self.support_uac = m.get('support_uac')
        if m.get('scripts_package_id') is not None:
            self.scripts_package_id = m.get('scripts_package_id')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('inventory') is not None:
            self.inventory = m.get('inventory')
        self.audio_video_infos = []
        if m.get('audio_video_infos') is not None:
            for k in m.get('audio_video_infos'):
                temp_model = EvidenceUrlInfo()
                self.audio_video_infos.append(temp_model.from_map(k))
        if m.get('screen_cancel_info') is not None:
            temp_model = ScreenCancelInfo()
            self.screen_cancel_info = temp_model.from_map(m['screen_cancel_info'])
        return self


class CreateRecordscreenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id

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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryRecordscreenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 取证id
        self.evidence_id = evidence_id

    def validate(self):
        self.validate_required(self.evidence_id, 'evidence_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        return self


class QueryRecordscreenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        evidence_id: str = None,
        status: str = None,
        operate_url: str = None,
        data: RecordScreenData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取证id
        self.evidence_id = evidence_id
        # 取证状态 具体见附录 RecordScreenStatus
        self.status = status
        # 取证操作Url （状态为INIT和DOING 时返回 可以重复打开使用）
        self.operate_url = operate_url
        # 取证详情（状态为PACKAGING,SUCCESS,FAIL才有数据）
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
        if self.evidence_id is not None:
            result['evidence_id'] = self.evidence_id
        if self.status is not None:
            result['status'] = self.status
        if self.operate_url is not None:
            result['operate_url'] = self.operate_url
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
        if m.get('evidence_id') is not None:
            self.evidence_id = m.get('evidence_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('operate_url') is not None:
            self.operate_url = m.get('operate_url')
        if m.get('data') is not None:
            temp_model = RecordScreenData()
            self.data = temp_model.from_map(m['data'])
        return self


class ListNotaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class ListNotaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        notary_list: List[NotaryPublicOffice] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 公证处列表
        self.notary_list = notary_list

    def validate(self):
        if self.notary_list:
            for k in self.notary_list:
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
        result['notary_list'] = []
        if self.notary_list is not None:
            for k in self.notary_list:
                result['notary_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.notary_list = []
        if m.get('notary_list') is not None:
            for k in m.get('notary_list'):
                temp_model = NotaryPublicOffice()
                self.notary_list.append(temp_model.from_map(k))
        return self


class CreateDirectmonitorTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        submit_type: str = None,
        submit_content: str = None,
        file_name: str = None,
        file_type: str = None,
        detail_file_type: str = None,
        task_name: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 提交类型，FILE/URL
        # 
        self.submit_type = submit_type
        # submitType 是FILE就传 oss fileId，是URL就传url地址
        self.submit_content = submit_content
        # 文件名称
        self.file_name = file_name
        # 文件类别 IMAGE/TEXT/VIDEO/AUDIO
        # 
        self.file_type = file_type
        # 详细文件类型，在fileType为IMAGE时，当前仅支持MARKETING_IMAGE营销图片
        self.detail_file_type = detail_file_type
        # 定向监测任务名称
        self.task_name = task_name
        # 幂等号，用于保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.submit_type, 'submit_type')
        self.validate_required(self.submit_content, 'submit_content')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.detail_file_type, 'detail_file_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.submit_type is not None:
            result['submit_type'] = self.submit_type
        if self.submit_content is not None:
            result['submit_content'] = self.submit_content
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.detail_file_type is not None:
            result['detail_file_type'] = self.detail_file_type
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('submit_type') is not None:
            self.submit_type = m.get('submit_type')
        if m.get('submit_content') is not None:
            self.submit_content = m.get('submit_content')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('detail_file_type') is not None:
            self.detail_file_type = m.get('detail_file_type')
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateDirectmonitorTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        monitor_task_id: str = None,
        is_exist_similar: bool = None,
        monitor_result_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测任务id
        self.monitor_task_id = monitor_task_id
        # 是否存在相似结果
        self.is_exist_similar = is_exist_similar
        # 监测结果总数量
        self.monitor_result_count = monitor_result_count

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
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.is_exist_similar is not None:
            result['is_exist_similar'] = self.is_exist_similar
        if self.monitor_result_count is not None:
            result['monitor_result_count'] = self.monitor_result_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('is_exist_similar') is not None:
            self.is_exist_similar = m.get('is_exist_similar')
        if m.get('monitor_result_count') is not None:
            self.monitor_result_count = m.get('monitor_result_count')
        return self


class QueryDirectmonitorResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        monitor_task_id: str = None,
        page_size: int = None,
        page_index: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 监测任务id
        self.monitor_task_id = monitor_task_id
        # 页面大小(1-200)
        self.page_size = page_size
        # 页码(>0)
        self.page_index = page_index

    def validate(self):
        self.validate_required(self.monitor_task_id, 'monitor_task_id')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.page_index, 'page_index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_index is not None:
            result['page_index'] = self.page_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        return self


class QueryDirectmonitorResultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        monitor_task_id: str = None,
        result_count: int = None,
        monitor_result_list: List[DirectMonitorResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 监测任务id
        self.monitor_task_id = monitor_task_id
        # 当前页面监测结果数量
        self.result_count = result_count
        # 监测结果列表
        self.monitor_result_list = monitor_result_list

    def validate(self):
        if self.monitor_result_list:
            for k in self.monitor_result_list:
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
        if self.monitor_task_id is not None:
            result['monitor_task_id'] = self.monitor_task_id
        if self.result_count is not None:
            result['result_count'] = self.result_count
        result['monitor_result_list'] = []
        if self.monitor_result_list is not None:
            for k in self.monitor_result_list:
                result['monitor_result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('monitor_task_id') is not None:
            self.monitor_task_id = m.get('monitor_task_id')
        if m.get('result_count') is not None:
            self.result_count = m.get('result_count')
        self.monitor_result_list = []
        if m.get('monitor_result_list') is not None:
            for k in m.get('monitor_result_list'):
                temp_model = DirectMonitorResult()
                self.monitor_result_list.append(temp_model.from_map(k))
        return self


class CreateDciPreregistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        work_name: str = None,
        work_category: str = None,
        recommend_work_category: str = None,
        work_file_id: str = None,
        file_type: str = None,
        creation_info: DciCreationInfo = None,
        publication_info: DciPublicationInfo = None,
        author_name: str = None,
        author_signature: str = None,
        original_statement: str = None,
        right_info: DciRightInfo = None,
        pre_registration_true_will: str = None,
        dci_user_id: str = None,
        proxy_data: ProxyData = None,
        client_token: str = None,
        category_similar_ratio: str = None,
        category_risk_rank: str = None,
        copyright_owner_ids: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 作品名称
        self.work_name = work_name
        # 作品类型
        self.work_category = work_category
        # 推荐作品分类
        self.recommend_work_category = recommend_work_category
        # 作品oss文件Id
        self.work_file_id = work_file_id
        # 文件类型
        self.file_type = file_type
        # 创作信息
        self.creation_info = creation_info
        # 发表信息
        self.publication_info = publication_info
        # 作者姓名
        self.author_name = author_name
        # 作者署名
        self.author_signature = author_signature
        # 原创声明
        self.original_statement = original_statement
        # 权利信息
        self.right_info = right_info
        # 真实意愿表达信息
        self.pre_registration_true_will = pre_registration_true_will
        # dci用户id
        self.dci_user_id = dci_user_id
        # 代理信息
        self.proxy_data = proxy_data
        # 幂等字段
        self.client_token = client_token
        # 作品类型相似度
        self.category_similar_ratio = category_similar_ratio
        # 作品类型风险等级
        self.category_risk_rank = category_risk_rank
        # 著作权人用户id List
        self.copyright_owner_ids = copyright_owner_ids

    def validate(self):
        self.validate_required(self.work_name, 'work_name')
        self.validate_required(self.work_category, 'work_category')
        self.validate_required(self.work_file_id, 'work_file_id')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.creation_info, 'creation_info')
        if self.creation_info:
            self.creation_info.validate()
        self.validate_required(self.publication_info, 'publication_info')
        if self.publication_info:
            self.publication_info.validate()
        self.validate_required(self.author_name, 'author_name')
        self.validate_required(self.right_info, 'right_info')
        if self.right_info:
            self.right_info.validate()
        self.validate_required(self.pre_registration_true_will, 'pre_registration_true_will')
        self.validate_required(self.dci_user_id, 'dci_user_id')
        self.validate_required(self.proxy_data, 'proxy_data')
        if self.proxy_data:
            self.proxy_data.validate()
        self.validate_required(self.client_token, 'client_token')
        self.validate_required(self.copyright_owner_ids, 'copyright_owner_ids')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.work_name is not None:
            result['work_name'] = self.work_name
        if self.work_category is not None:
            result['work_category'] = self.work_category
        if self.recommend_work_category is not None:
            result['recommend_work_category'] = self.recommend_work_category
        if self.work_file_id is not None:
            result['work_file_id'] = self.work_file_id
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.creation_info is not None:
            result['creation_info'] = self.creation_info.to_map()
        if self.publication_info is not None:
            result['publication_info'] = self.publication_info.to_map()
        if self.author_name is not None:
            result['author_name'] = self.author_name
        if self.author_signature is not None:
            result['author_signature'] = self.author_signature
        if self.original_statement is not None:
            result['original_statement'] = self.original_statement
        if self.right_info is not None:
            result['right_info'] = self.right_info.to_map()
        if self.pre_registration_true_will is not None:
            result['pre_registration_true_will'] = self.pre_registration_true_will
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.proxy_data is not None:
            result['proxy_data'] = self.proxy_data.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.category_similar_ratio is not None:
            result['category_similar_ratio'] = self.category_similar_ratio
        if self.category_risk_rank is not None:
            result['category_risk_rank'] = self.category_risk_rank
        if self.copyright_owner_ids is not None:
            result['copyright_owner_ids'] = self.copyright_owner_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('work_name') is not None:
            self.work_name = m.get('work_name')
        if m.get('work_category') is not None:
            self.work_category = m.get('work_category')
        if m.get('recommend_work_category') is not None:
            self.recommend_work_category = m.get('recommend_work_category')
        if m.get('work_file_id') is not None:
            self.work_file_id = m.get('work_file_id')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('creation_info') is not None:
            temp_model = DciCreationInfo()
            self.creation_info = temp_model.from_map(m['creation_info'])
        if m.get('publication_info') is not None:
            temp_model = DciPublicationInfo()
            self.publication_info = temp_model.from_map(m['publication_info'])
        if m.get('author_name') is not None:
            self.author_name = m.get('author_name')
        if m.get('author_signature') is not None:
            self.author_signature = m.get('author_signature')
        if m.get('original_statement') is not None:
            self.original_statement = m.get('original_statement')
        if m.get('right_info') is not None:
            temp_model = DciRightInfo()
            self.right_info = temp_model.from_map(m['right_info'])
        if m.get('pre_registration_true_will') is not None:
            self.pre_registration_true_will = m.get('pre_registration_true_will')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('proxy_data') is not None:
            temp_model = ProxyData()
            self.proxy_data = temp_model.from_map(m['proxy_data'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('category_similar_ratio') is not None:
            self.category_similar_ratio = m.get('category_similar_ratio')
        if m.get('category_risk_rank') is not None:
            self.category_risk_rank = m.get('category_risk_rank')
        if m.get('copyright_owner_ids') is not None:
            self.copyright_owner_ids = m.get('copyright_owner_ids')
        return self


class CreateDciPreregistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        dci_content_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # dci内容id
        self.dci_content_id = dci_content_id

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
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryDciPreregistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_user_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci用户id
        self.dci_user_id = dci_user_id
        # dci内容id
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.dci_user_id, 'dci_user_id')
        self.validate_required(self.dci_content_id, 'dci_content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryDciPreregistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        file_hash: str = None,
        file_hash_tx_hash: str = None,
        file_hash_block_height: str = None,
        dci_code: str = None,
        dci_code_tx_hash: str = None,
        dci_code_block_height: str = None,
        dci_code_file_tx_hash: str = None,
        dci_code_file_block_height: str = None,
        pre_reg_cert_tx_hash: str = None,
        pre_reg_cert_block_height: str = None,
        cancel_tx_hash: str = None,
        cancel_block_height: str = None,
        dci_code_tsr: str = None,
        dci_code_file_tsr: str = None,
        pre_reg_cert_tsr: str = None,
        pre_reg_cert_file_id: str = None,
        pre_reg_cert_file_hash: str = None,
        pre_reg_cert_url: str = None,
        png_file_id: str = None,
        apply_obtain_date: str = None,
        dci_code_obtain_date: str = None,
        error_reason: str = None,
        publication_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预登记状态
        self.status = status
        # 文件哈希
        self.file_hash = file_hash
        # 文件哈希存证txHash
        self.file_hash_tx_hash = file_hash_tx_hash
        # 文件哈希存证区块高度
        self.file_hash_block_height = file_hash_block_height
        # dci编码
        self.dci_code = dci_code
        # DCI码存证txHash
        self.dci_code_tx_hash = dci_code_tx_hash
        # DCI码存证高度
        self.dci_code_block_height = dci_code_block_height
        # DCI码fileHash存证txHash
        self.dci_code_file_tx_hash = dci_code_file_tx_hash
        # DCI码fileHash存证高度
        self.dci_code_file_block_height = dci_code_file_block_height
        # 预登记证书txhash
        self.pre_reg_cert_tx_hash = pre_reg_cert_tx_hash
        # 预登记证书存证高度
        self.pre_reg_cert_block_height = pre_reg_cert_block_height
        # 预登记取消txHash
        self.cancel_tx_hash = cancel_tx_hash
        # 预登记取消存证高度
        self.cancel_block_height = cancel_block_height
        # dciCode的可信时间戳信息
        self.dci_code_tsr = dci_code_tsr
        # dciCode fileHash的可信时间戳信息
        self.dci_code_file_tsr = dci_code_file_tsr
        # 预登记证书可信时间戳信息
        self.pre_reg_cert_tsr = pre_reg_cert_tsr
        # 预登记证书oss fileId
        self.pre_reg_cert_file_id = pre_reg_cert_file_id
        # 预登记证书fileHash
        self.pre_reg_cert_file_hash = pre_reg_cert_file_hash
        # 预登记证书下载链接
        self.pre_reg_cert_url = pre_reg_cert_url
        # 预览图oss fileId
        self.png_file_id = png_file_id
        # 申请发码时间
        self.apply_obtain_date = apply_obtain_date
        # DCI码创建时间
        self.dci_code_obtain_date = dci_code_obtain_date
        # 错误原因
        self.error_reason = error_reason
        # 公式地址
        self.publication_url = publication_url

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
        if self.status is not None:
            result['status'] = self.status
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        if self.file_hash_tx_hash is not None:
            result['file_hash_tx_hash'] = self.file_hash_tx_hash
        if self.file_hash_block_height is not None:
            result['file_hash_block_height'] = self.file_hash_block_height
        if self.dci_code is not None:
            result['dci_code'] = self.dci_code
        if self.dci_code_tx_hash is not None:
            result['dci_code_tx_hash'] = self.dci_code_tx_hash
        if self.dci_code_block_height is not None:
            result['dci_code_block_height'] = self.dci_code_block_height
        if self.dci_code_file_tx_hash is not None:
            result['dci_code_file_tx_hash'] = self.dci_code_file_tx_hash
        if self.dci_code_file_block_height is not None:
            result['dci_code_file_block_height'] = self.dci_code_file_block_height
        if self.pre_reg_cert_tx_hash is not None:
            result['pre_reg_cert_tx_hash'] = self.pre_reg_cert_tx_hash
        if self.pre_reg_cert_block_height is not None:
            result['pre_reg_cert_block_height'] = self.pre_reg_cert_block_height
        if self.cancel_tx_hash is not None:
            result['cancel_tx_hash'] = self.cancel_tx_hash
        if self.cancel_block_height is not None:
            result['cancel_block_height'] = self.cancel_block_height
        if self.dci_code_tsr is not None:
            result['dci_code_tsr'] = self.dci_code_tsr
        if self.dci_code_file_tsr is not None:
            result['dci_code_file_tsr'] = self.dci_code_file_tsr
        if self.pre_reg_cert_tsr is not None:
            result['pre_reg_cert_tsr'] = self.pre_reg_cert_tsr
        if self.pre_reg_cert_file_id is not None:
            result['pre_reg_cert_file_id'] = self.pre_reg_cert_file_id
        if self.pre_reg_cert_file_hash is not None:
            result['pre_reg_cert_file_hash'] = self.pre_reg_cert_file_hash
        if self.pre_reg_cert_url is not None:
            result['pre_reg_cert_url'] = self.pre_reg_cert_url
        if self.png_file_id is not None:
            result['png_file_id'] = self.png_file_id
        if self.apply_obtain_date is not None:
            result['apply_obtain_date'] = self.apply_obtain_date
        if self.dci_code_obtain_date is not None:
            result['dci_code_obtain_date'] = self.dci_code_obtain_date
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        if self.publication_url is not None:
            result['publication_url'] = self.publication_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        if m.get('file_hash_tx_hash') is not None:
            self.file_hash_tx_hash = m.get('file_hash_tx_hash')
        if m.get('file_hash_block_height') is not None:
            self.file_hash_block_height = m.get('file_hash_block_height')
        if m.get('dci_code') is not None:
            self.dci_code = m.get('dci_code')
        if m.get('dci_code_tx_hash') is not None:
            self.dci_code_tx_hash = m.get('dci_code_tx_hash')
        if m.get('dci_code_block_height') is not None:
            self.dci_code_block_height = m.get('dci_code_block_height')
        if m.get('dci_code_file_tx_hash') is not None:
            self.dci_code_file_tx_hash = m.get('dci_code_file_tx_hash')
        if m.get('dci_code_file_block_height') is not None:
            self.dci_code_file_block_height = m.get('dci_code_file_block_height')
        if m.get('pre_reg_cert_tx_hash') is not None:
            self.pre_reg_cert_tx_hash = m.get('pre_reg_cert_tx_hash')
        if m.get('pre_reg_cert_block_height') is not None:
            self.pre_reg_cert_block_height = m.get('pre_reg_cert_block_height')
        if m.get('cancel_tx_hash') is not None:
            self.cancel_tx_hash = m.get('cancel_tx_hash')
        if m.get('cancel_block_height') is not None:
            self.cancel_block_height = m.get('cancel_block_height')
        if m.get('dci_code_tsr') is not None:
            self.dci_code_tsr = m.get('dci_code_tsr')
        if m.get('dci_code_file_tsr') is not None:
            self.dci_code_file_tsr = m.get('dci_code_file_tsr')
        if m.get('pre_reg_cert_tsr') is not None:
            self.pre_reg_cert_tsr = m.get('pre_reg_cert_tsr')
        if m.get('pre_reg_cert_file_id') is not None:
            self.pre_reg_cert_file_id = m.get('pre_reg_cert_file_id')
        if m.get('pre_reg_cert_file_hash') is not None:
            self.pre_reg_cert_file_hash = m.get('pre_reg_cert_file_hash')
        if m.get('pre_reg_cert_url') is not None:
            self.pre_reg_cert_url = m.get('pre_reg_cert_url')
        if m.get('png_file_id') is not None:
            self.png_file_id = m.get('png_file_id')
        if m.get('apply_obtain_date') is not None:
            self.apply_obtain_date = m.get('apply_obtain_date')
        if m.get('dci_code_obtain_date') is not None:
            self.dci_code_obtain_date = m.get('dci_code_obtain_date')
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        if m.get('publication_url') is not None:
            self.publication_url = m.get('publication_url')
        return self


class AddDciUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_name: str = None,
        certificate_type: str = None,
        certificate_number: str = None,
        certificate_start_time: str = None,
        certificate_end_time: str = None,
        certificate_front_file_id: str = None,
        certificate_back_file_id: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_type: str = None,
        legal_person_cert_no: str = None,
        phone: str = None,
        address: str = None,
        identity_start_time: str = None,
        area_type: str = None,
        proxy_data: ProxyData = None,
        client_token: str = None,
        user_name: str = None,
        certificate_front_file_path: str = None,
        certificate_back_file_path: str = None,
        user_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户名称
        self.cert_name = cert_name
        # 证件类型
        self.certificate_type = certificate_type
        # 证件号
        self.certificate_number = certificate_number
        # 证件有效期限起始日期
        self.certificate_start_time = certificate_start_time
        # 证件有效期限终止日期
        self.certificate_end_time = certificate_end_time
        # 证件正面OSS fileId
        self.certificate_front_file_id = certificate_front_file_id
        # 证件反面OSS fileId
        self.certificate_back_file_id = certificate_back_file_id
        # 法人名称
        self.legal_person_cert_name = legal_person_cert_name
        # 法人证件类型
        self.legal_person_cert_type = legal_person_cert_type
        # 法人证件号
        self.legal_person_cert_no = legal_person_cert_no
        # 手机号
        self.phone = phone
        # 地址
        self.address = address
        # 用户身份开始时间
        self.identity_start_time = identity_start_time
        # 所属地区
        self.area_type = area_type
        # 代理信息
        self.proxy_data = proxy_data
        # 幂等字段
        self.client_token = client_token
        # 用户名称废弃
        self.user_name = user_name
        # 证件正面OSS fileId废弃
        self.certificate_front_file_path = certificate_front_file_path
        # 证件反面OSS filePath废弃
        self.certificate_back_file_path = certificate_back_file_path
        # 用户类型废弃
        self.user_type = user_type

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.certificate_type, 'certificate_type')
        self.validate_required(self.certificate_number, 'certificate_number')
        self.validate_required(self.certificate_front_file_id, 'certificate_front_file_id')
        self.validate_required(self.phone, 'phone')
        self.validate_required(self.address, 'address')
        self.validate_required(self.identity_start_time, 'identity_start_time')
        self.validate_required(self.area_type, 'area_type')
        self.validate_required(self.proxy_data, 'proxy_data')
        if self.proxy_data:
            self.proxy_data.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.certificate_number is not None:
            result['certificate_number'] = self.certificate_number
        if self.certificate_start_time is not None:
            result['certificate_start_time'] = self.certificate_start_time
        if self.certificate_end_time is not None:
            result['certificate_end_time'] = self.certificate_end_time
        if self.certificate_front_file_id is not None:
            result['certificate_front_file_id'] = self.certificate_front_file_id
        if self.certificate_back_file_id is not None:
            result['certificate_back_file_id'] = self.certificate_back_file_id
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_type is not None:
            result['legal_person_cert_type'] = self.legal_person_cert_type
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.phone is not None:
            result['phone'] = self.phone
        if self.address is not None:
            result['address'] = self.address
        if self.identity_start_time is not None:
            result['identity_start_time'] = self.identity_start_time
        if self.area_type is not None:
            result['area_type'] = self.area_type
        if self.proxy_data is not None:
            result['proxy_data'] = self.proxy_data.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.certificate_front_file_path is not None:
            result['certificate_front_file_path'] = self.certificate_front_file_path
        if self.certificate_back_file_path is not None:
            result['certificate_back_file_path'] = self.certificate_back_file_path
        if self.user_type is not None:
            result['user_type'] = self.user_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('certificate_number') is not None:
            self.certificate_number = m.get('certificate_number')
        if m.get('certificate_start_time') is not None:
            self.certificate_start_time = m.get('certificate_start_time')
        if m.get('certificate_end_time') is not None:
            self.certificate_end_time = m.get('certificate_end_time')
        if m.get('certificate_front_file_id') is not None:
            self.certificate_front_file_id = m.get('certificate_front_file_id')
        if m.get('certificate_back_file_id') is not None:
            self.certificate_back_file_id = m.get('certificate_back_file_id')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_type') is not None:
            self.legal_person_cert_type = m.get('legal_person_cert_type')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('identity_start_time') is not None:
            self.identity_start_time = m.get('identity_start_time')
        if m.get('area_type') is not None:
            self.area_type = m.get('area_type')
        if m.get('proxy_data') is not None:
            temp_model = ProxyData()
            self.proxy_data = temp_model.from_map(m['proxy_data'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('certificate_front_file_path') is not None:
            self.certificate_front_file_path = m.get('certificate_front_file_path')
        if m.get('certificate_back_file_path') is not None:
            self.certificate_back_file_path = m.get('certificate_back_file_path')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        return self


class AddDciUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        dci_user_id: str = None,
        dci_user_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # dci用户id
        self.dci_user_id = dci_user_id
        # dci用户状态
        self.dci_user_status = dci_user_status

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
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_user_status is not None:
            result['dci_user_status'] = self.dci_user_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_user_status') is not None:
            self.dci_user_status = m.get('dci_user_status')
        return self


class RetryDciPreregistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_user_id: str = None,
        dci_content_id: str = None,
        proxy_data: ProxyData = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci用户id
        self.dci_user_id = dci_user_id
        # dci内容id
        self.dci_content_id = dci_content_id
        # 代理信息
        self.proxy_data = proxy_data
        # 幂等信息
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.dci_user_id, 'dci_user_id')
        self.validate_required(self.dci_content_id, 'dci_content_id')
        self.validate_required(self.proxy_data, 'proxy_data')
        if self.proxy_data:
            self.proxy_data.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.proxy_data is not None:
            result['proxy_data'] = self.proxy_data.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('proxy_data') is not None:
            temp_model = ProxyData()
            self.proxy_data = temp_model.from_map(m['proxy_data'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class RetryDciPreregistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class QueryDciUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certificate_type: str = None,
        certificate_number: str = None,
        phone: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 证件类型
        self.certificate_type = certificate_type
        # 证件号
        self.certificate_number = certificate_number
        # 手机号
        self.phone = phone

    def validate(self):
        self.validate_required(self.certificate_type, 'certificate_type')
        self.validate_required(self.certificate_number, 'certificate_number')
        self.validate_required(self.phone, 'phone')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.certificate_number is not None:
            result['certificate_number'] = self.certificate_number
        if self.phone is not None:
            result['phone'] = self.phone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('certificate_number') is not None:
            self.certificate_number = m.get('certificate_number')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        return self


class QueryDciUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        dci_user_id: str = None,
        dci_user_status: str = None,
        name: str = None,
        certificate_type: str = None,
        certificate_number: str = None,
        address: str = None,
        cert_start_time: str = None,
        cert_end_time: str = None,
        legal_person: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # dci用户id
        self.dci_user_id = dci_user_id
        # dci用户状态
        self.dci_user_status = dci_user_status
        # 名称
        self.name = name
        # 证件类型
        self.certificate_type = certificate_type
        # 证件号
        self.certificate_number = certificate_number
        # 地址
        self.address = address
        # 证件有效期开始时间
        self.cert_start_time = cert_start_time
        # 证件有效期结束时间
        self.cert_end_time = cert_end_time
        # 法人名称
        self.legal_person = legal_person

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
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_user_status is not None:
            result['dci_user_status'] = self.dci_user_status
        if self.name is not None:
            result['name'] = self.name
        if self.certificate_type is not None:
            result['certificate_type'] = self.certificate_type
        if self.certificate_number is not None:
            result['certificate_number'] = self.certificate_number
        if self.address is not None:
            result['address'] = self.address
        if self.cert_start_time is not None:
            result['cert_start_time'] = self.cert_start_time
        if self.cert_end_time is not None:
            result['cert_end_time'] = self.cert_end_time
        if self.legal_person is not None:
            result['legal_person'] = self.legal_person
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_user_status') is not None:
            self.dci_user_status = m.get('dci_user_status')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('certificate_type') is not None:
            self.certificate_type = m.get('certificate_type')
        if m.get('certificate_number') is not None:
            self.certificate_number = m.get('certificate_number')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('cert_start_time') is not None:
            self.cert_start_time = m.get('cert_start_time')
        if m.get('cert_end_time') is not None:
            self.cert_end_time = m.get('cert_end_time')
        if m.get('legal_person') is not None:
            self.legal_person = m.get('legal_person')
        return self


class QueryDciPreregpublicationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 作品id
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryDciPreregpublicationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        publication_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 供核验公示地址
        self.publication_url = publication_url

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
        if self.publication_url is not None:
            result['publication_url'] = self.publication_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('publication_url') is not None:
            self.publication_url = m.get('publication_url')
        return self


class UpdateDciUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_user_id: str = None,
        cert_front_file_id: str = None,
        cert_back_file_id: str = None,
        phone: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci用户ID
        self.dci_user_id = dci_user_id
        # 证件正面oss fileId
        self.cert_front_file_id = cert_front_file_id
        # 证件背面oss fileId
        self.cert_back_file_id = cert_back_file_id
        # 手机号
        self.phone = phone
        # 客户端令牌
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.dci_user_id, 'dci_user_id')
        self.validate_required(self.cert_front_file_id, 'cert_front_file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.cert_front_file_id is not None:
            result['cert_front_file_id'] = self.cert_front_file_id
        if self.cert_back_file_id is not None:
            result['cert_back_file_id'] = self.cert_back_file_id
        if self.phone is not None:
            result['phone'] = self.phone
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('cert_front_file_id') is not None:
            self.cert_front_file_id = m.get('cert_front_file_id')
        if m.get('cert_back_file_id') is not None:
            self.cert_back_file_id = m.get('cert_back_file_id')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class UpdateDciUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class CreateDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_content_id: str = None,
        creation_statement: str = None,
        ancillary_evidence_path_list: List[str] = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # DC456
        self.dci_content_id = dci_content_id
        # 作品创作申明
        self.creation_statement = creation_statement
        # 补充授权文件
        self.ancillary_evidence_path_list = ancillary_evidence_path_list
        # 客户端令牌
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')
        self.validate_required(self.creation_statement, 'creation_statement')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.creation_statement is not None:
            result['creation_statement'] = self.creation_statement
        if self.ancillary_evidence_path_list is not None:
            result['ancillary_evidence_path_list'] = self.ancillary_evidence_path_list
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('creation_statement') is not None:
            self.creation_statement = m.get('creation_statement')
        if m.get('ancillary_evidence_path_list') is not None:
            self.ancillary_evidence_path_list = m.get('ancillary_evidence_path_list')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateDciRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class QueryDciRegistrationsubmitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci内容id
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryDciRegistrationsubmitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数登提交状态
        self.content_status = content_status

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
        if self.content_status is not None:
            result['content_status'] = self.content_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_status') is not None:
            self.content_status = m.get('content_status')
        return self


class QueryDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci内容id
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryDciRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_status: str = None,
        register_cert_tx_hash: str = None,
        register_cert_block_height: str = None,
        register_cert_tsr: str = None,
        register_cert_png_file_id: str = None,
        register_sample_file_id: str = None,
        register_sample_png_file_id: str = None,
        register_download_times_left: int = None,
        error_reason: str = None,
        invoice_file_id_list: List[str] = None,
        apply_register_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态
        self.content_status = content_status
        # 登记证书txHash
        self.register_cert_tx_hash = register_cert_tx_hash
        # 登记证书存证高度
        self.register_cert_block_height = register_cert_block_height
        # 登记证书tsr
        self.register_cert_tsr = register_cert_tsr
        # 登记证书预览fileId
        self.register_cert_png_file_id = register_cert_png_file_id
        # 数登样本oss fileId
        self.register_sample_file_id = register_sample_file_id
        # 数登样本预览oss fileId
        self.register_sample_png_file_id = register_sample_png_file_id
        # 剩余下载次数
        self.register_download_times_left = register_download_times_left
        # 错误原因
        self.error_reason = error_reason
        # 发票oss fileId List
        self.invoice_file_id_list = invoice_file_id_list
        # 数登申请时间
        self.apply_register_time = apply_register_time

    def validate(self):
        if self.apply_register_time is not None:
            self.validate_pattern(self.apply_register_time, 'apply_register_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.content_status is not None:
            result['content_status'] = self.content_status
        if self.register_cert_tx_hash is not None:
            result['register_cert_tx_hash'] = self.register_cert_tx_hash
        if self.register_cert_block_height is not None:
            result['register_cert_block_height'] = self.register_cert_block_height
        if self.register_cert_tsr is not None:
            result['register_cert_tsr'] = self.register_cert_tsr
        if self.register_cert_png_file_id is not None:
            result['register_cert_png_file_id'] = self.register_cert_png_file_id
        if self.register_sample_file_id is not None:
            result['register_sample_file_id'] = self.register_sample_file_id
        if self.register_sample_png_file_id is not None:
            result['register_sample_png_file_id'] = self.register_sample_png_file_id
        if self.register_download_times_left is not None:
            result['register_download_times_left'] = self.register_download_times_left
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        if self.invoice_file_id_list is not None:
            result['invoice_file_id_list'] = self.invoice_file_id_list
        if self.apply_register_time is not None:
            result['apply_register_time'] = self.apply_register_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_status') is not None:
            self.content_status = m.get('content_status')
        if m.get('register_cert_tx_hash') is not None:
            self.register_cert_tx_hash = m.get('register_cert_tx_hash')
        if m.get('register_cert_block_height') is not None:
            self.register_cert_block_height = m.get('register_cert_block_height')
        if m.get('register_cert_tsr') is not None:
            self.register_cert_tsr = m.get('register_cert_tsr')
        if m.get('register_cert_png_file_id') is not None:
            self.register_cert_png_file_id = m.get('register_cert_png_file_id')
        if m.get('register_sample_file_id') is not None:
            self.register_sample_file_id = m.get('register_sample_file_id')
        if m.get('register_sample_png_file_id') is not None:
            self.register_sample_png_file_id = m.get('register_sample_png_file_id')
        if m.get('register_download_times_left') is not None:
            self.register_download_times_left = m.get('register_download_times_left')
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        if m.get('invoice_file_id_list') is not None:
            self.invoice_file_id_list = m.get('invoice_file_id_list')
        if m.get('apply_register_time') is not None:
            self.apply_register_time = m.get('apply_register_time')
        return self


class GetDciRegistrationcertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_content_id: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci内容id
        self.dci_content_id = dci_content_id
        # 幂等字段
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class GetDciRegistrationcertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cert_status: str = None,
        certificate_url: str = None,
        download_times_left: int = None,
        error_reason: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证书状态
        self.cert_status = cert_status
        # 证书下载链接
        self.certificate_url = certificate_url
        # 剩余下载次数
        self.download_times_left = download_times_left
        # 错误原因
        self.error_reason = error_reason

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
        if self.cert_status is not None:
            result['cert_status'] = self.cert_status
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        if self.download_times_left is not None:
            result['download_times_left'] = self.download_times_left
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cert_status') is not None:
            self.cert_status = m.get('cert_status')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        if m.get('download_times_left') is not None:
            self.download_times_left = m.get('download_times_left')
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        return self


class QueryDciContentsecurityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        work_name: str = None,
        work_hash: str = None,
        work_category: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id
        # 作品名称
        self.work_name = work_name
        # 作品哈希
        self.work_hash = work_hash
        # 作品类型
        self.work_category = work_category
        # 客户端令牌
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.work_name, 'work_name')
        self.validate_required(self.work_hash, 'work_hash')
        self.validate_required(self.work_category, 'work_category')

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
        if self.work_name is not None:
            result['work_name'] = self.work_name
        if self.work_hash is not None:
            result['work_hash'] = self.work_hash
        if self.work_category is not None:
            result['work_category'] = self.work_category
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('work_name') is not None:
            self.work_name = m.get('work_name')
        if m.get('work_hash') is not None:
            self.work_hash = m.get('work_hash')
        if m.get('work_category') is not None:
            self.work_category = m.get('work_category')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class QueryDciContentsecurityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        review_data: ReviewData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 审查结果
        self.review_data = review_data

    def validate(self):
        if self.review_data:
            self.review_data.validate()

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
        if self.review_data is not None:
            result['review_data'] = self.review_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('review_data') is not None:
            temp_model = ReviewData()
            self.review_data = temp_model.from_map(m['review_data'])
        return self


class CreateDciRegistrationcertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        user_id: str = None,
        dci_code: str = None,
        reg_number: str = None,
        qr_code_url: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id
        # 版权用户ID
        self.user_id = user_id
        # DCI码
        self.dci_code = dci_code
        # 登记号
        self.reg_number = reg_number
        # 二维码
        self.qr_code_url = qr_code_url
        # 客户端token
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.dci_code, 'dci_code')
        self.validate_required(self.reg_number, 'reg_number')
        self.validate_required(self.qr_code_url, 'qr_code_url')

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
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.dci_code is not None:
            result['dci_code'] = self.dci_code
        if self.reg_number is not None:
            result['reg_number'] = self.reg_number
        if self.qr_code_url is not None:
            result['qr_code_url'] = self.qr_code_url
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('dci_code') is not None:
            self.dci_code = m.get('dci_code')
        if m.get('reg_number') is not None:
            self.reg_number = m.get('reg_number')
        if m.get('qr_code_url') is not None:
            self.qr_code_url = m.get('qr_code_url')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateDciRegistrationcertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class QueryDciRegistrationcertRequest(TeaModel):
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


class QueryDciRegistrationcertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certificate_data: CertificateData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证书信息
        self.certificate_data = certificate_data

    def validate(self):
        if self.certificate_data:
            self.certificate_data.validate()

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
        if self.certificate_data is not None:
            result['certificate_data'] = self.certificate_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certificate_data') is not None:
            temp_model = CertificateData()
            self.certificate_data = temp_model.from_map(m['certificate_data'])
        return self


class GetDciPayurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_user_id: str = None,
        dci_content_id: str = None,
        pay_ment: str = None,
        invoice_info: InvoiceInfo = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci用户id
        self.dci_user_id = dci_user_id
        # dci内容id
        self.dci_content_id = dci_content_id
        # 支付方式 0：支付宝
        self.pay_ment = pay_ment
        # 发票信息-当前支持普票
        self.invoice_info = invoice_info
        # 客户端token，幂等号，用来保证并发请求幂等性
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.dci_user_id, 'dci_user_id')
        self.validate_required(self.dci_content_id, 'dci_content_id')
        self.validate_required(self.invoice_info, 'invoice_info')
        if self.invoice_info:
            self.invoice_info.validate()
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.pay_ment is not None:
            result['pay_ment'] = self.pay_ment
        if self.invoice_info is not None:
            result['invoice_info'] = self.invoice_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('pay_ment') is not None:
            self.pay_ment = m.get('pay_ment')
        if m.get('invoice_info') is not None:
            temp_model = InvoiceInfo()
            self.invoice_info = temp_model.from_map(m['invoice_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class GetDciPayurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付链接
        self.pay_url = pay_url

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
        if self.pay_url is not None:
            result['pay_url'] = self.pay_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_url') is not None:
            self.pay_url = m.get('pay_url')
        return self


class QueryDciPayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_user_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci用户id
        self.dci_user_id = dci_user_id
        # dci内容id
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.dci_user_id, 'dci_user_id')
        self.validate_required(self.dci_content_id, 'dci_content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryDciPayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_state: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付状态
        # （INIT 用户点击支付，待获取链接；GET_PAY_URL_FAIL 获取支付链接失败；PAY_FAIL 支付失败；TIMEOUT 支付超时；PAY_SUCCESS 支付成功；PAYING 支付中；PAY_EXCEPTION	支付异常，待重试）
        self.pay_state = pay_state

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
        if self.pay_state is not None:
            result['pay_state'] = self.pay_state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_state') is not None:
            self.pay_state = m.get('pay_state')
        return self


class CallbackDciPayresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        app_id: str = None,
        order_id: str = None,
        pay_ment: str = None,
        money: str = None,
        result_content: str = None,
        code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 与中心约定的任务ID，同一个作品可能会发起多次登记
        self.task_id = task_id
        # 平台Id
        self.app_id = app_id
        # 订单ID
        self.order_id = order_id
        # 支付方式 (ALIPAY,0,支付宝)
        self.pay_ment = pay_ment
        # 订单金额
        self.money = money
        # 结果描述，如：支付成功
        self.result_content = result_content
        # 状态，2001代表支付成功
        self.code = code

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.pay_ment, 'pay_ment')
        self.validate_required(self.money, 'money')
        self.validate_required(self.result_content, 'result_content')
        self.validate_required(self.code, 'code')

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
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.pay_ment is not None:
            result['pay_ment'] = self.pay_ment
        if self.money is not None:
            result['money'] = self.money
        if self.result_content is not None:
            result['result_content'] = self.result_content
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('pay_ment') is not None:
            self.pay_ment = m.get('pay_ment')
        if m.get('money') is not None:
            self.money = m.get('money')
        if m.get('result_content') is not None:
            self.result_content = m.get('result_content')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class CallbackDciPayresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class RefuseDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id
        # 客户端token，幂等号，用来保证并发请求幂等性
        self.client_token = client_token

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
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class RefuseDciRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class AddContentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_id: str = None,
        title: str = None,
        type: str = None,
        keywords: List[str] = None,
        description: str = None,
        cover_file_id: str = None,
        play_list_entity: PlayListEntity = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件id
        self.file_id = file_id
        # 内容标题
        self.title = title
        # 文件类型
        self.type = type
        # 内容标签列表
        self.keywords = keywords
        # 内容描述
        self.description = description
        # 内容封面文件id
        self.cover_file_id = cover_file_id
        # 播放列表实体：包括名称和各种授权维权信息
        self.play_list_entity = play_list_entity
        # 客户端token，幂等号，用来保证并发请求幂等性
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.title, 'title')
        self.validate_required(self.type, 'type')
        self.validate_required(self.play_list_entity, 'play_list_entity')
        if self.play_list_entity:
            self.play_list_entity.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.keywords is not None:
            result['keywords'] = self.keywords
        if self.description is not None:
            result['description'] = self.description
        if self.cover_file_id is not None:
            result['cover_file_id'] = self.cover_file_id
        if self.play_list_entity is not None:
            result['play_list_entity'] = self.play_list_entity.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('keywords') is not None:
            self.keywords = m.get('keywords')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('cover_file_id') is not None:
            self.cover_file_id = m.get('cover_file_id')
        if m.get('play_list_entity') is not None:
            temp_model = PlayListEntity()
            self.play_list_entity = temp_model.from_map(m['play_list_entity'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class AddContentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频内容id
        self.content_id = content_id

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
        if self.content_id is not None:
            result['content_id'] = self.content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        return self


class QueryContentStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 视频内容id
        self.content_id = content_id

    def validate(self):
        self.validate_required(self.content_id, 'content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content_id is not None:
            result['content_id'] = self.content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        return self


class QueryContentStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_id: str = None,
        status: str = None,
        title: str = None,
        type: str = None,
        keywords: List[str] = None,
        description: str = None,
        cover_url: str = None,
        register_id: str = None,
        auth_pdf_url: str = None,
        play_list_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频内容id
        self.content_id = content_id
        # 视频状态
        self.status = status
        # 内容标题
        self.title = title
        # 内容类型
        self.type = type
        # 标签列表
        self.keywords = keywords
        # 内容描述
        self.description = description
        # 内容封面文件地址
        self.cover_url = cover_url
        # 存证id
        self.register_id = register_id
        # 内容授权合同文件地址
        self.auth_pdf_url = auth_pdf_url
        # 播放列表名称
        self.play_list_name = play_list_name

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
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.status is not None:
            result['status'] = self.status
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.keywords is not None:
            result['keywords'] = self.keywords
        if self.description is not None:
            result['description'] = self.description
        if self.cover_url is not None:
            result['cover_url'] = self.cover_url
        if self.register_id is not None:
            result['register_id'] = self.register_id
        if self.auth_pdf_url is not None:
            result['auth_pdf_url'] = self.auth_pdf_url
        if self.play_list_name is not None:
            result['play_list_name'] = self.play_list_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('keywords') is not None:
            self.keywords = m.get('keywords')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('cover_url') is not None:
            self.cover_url = m.get('cover_url')
        if m.get('register_id') is not None:
            self.register_id = m.get('register_id')
        if m.get('auth_pdf_url') is not None:
            self.auth_pdf_url = m.get('auth_pdf_url')
        if m.get('play_list_name') is not None:
            self.play_list_name = m.get('play_list_name')
        return self


class QueryContentStatisticsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content_id: str = None,
        start_time: int = None,
        end_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 内容id
        self.content_id = content_id
        # 起始日期时间戳
        self.start_time = start_time
        # 截止日期时间戳
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.content_id, 'content_id')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class QueryContentStatisticsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_views: str = None,
        total_view_duration: str = None,
        total_average_view_duration: str = None,
        total_revenue: str = None,
        day_statistics_list: List[DayStatisticsInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总观看次数
        self.total_views = total_views
        # 总观看时长
        self.total_view_duration = total_view_duration
        # 总平均观看时长
        self.total_average_view_duration = total_average_view_duration
        # 总预计收入
        self.total_revenue = total_revenue
        # 每日详细统计列表
        self.day_statistics_list = day_statistics_list

    def validate(self):
        if self.day_statistics_list:
            for k in self.day_statistics_list:
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
        if self.total_views is not None:
            result['total_views'] = self.total_views
        if self.total_view_duration is not None:
            result['total_view_duration'] = self.total_view_duration
        if self.total_average_view_duration is not None:
            result['total_average_view_duration'] = self.total_average_view_duration
        if self.total_revenue is not None:
            result['total_revenue'] = self.total_revenue
        result['day_statistics_list'] = []
        if self.day_statistics_list is not None:
            for k in self.day_statistics_list:
                result['day_statistics_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_views') is not None:
            self.total_views = m.get('total_views')
        if m.get('total_view_duration') is not None:
            self.total_view_duration = m.get('total_view_duration')
        if m.get('total_average_view_duration') is not None:
            self.total_average_view_duration = m.get('total_average_view_duration')
        if m.get('total_revenue') is not None:
            self.total_revenue = m.get('total_revenue')
        self.day_statistics_list = []
        if m.get('day_statistics_list') is not None:
            for k in m.get('day_statistics_list'):
                temp_model = DayStatisticsInfo()
                self.day_statistics_list.append(temp_model.from_map(k))
        return self


class PublishGoodRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_id: str = None,
        title: str = None,
        goods_name: str = None,
        classification: str = None,
        standard_price_in_cent: int = None,
        goods_status: str = None,
        publish_time: int = None,
        auth_start_time: int = None,
        auth_end_time: int = None,
        is_author: bool = None,
        author_cert_name: str = None,
        author_cert_no: str = None,
        client_token: str = None,
        auth_info: List[AuthInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件id,最长64个字符
        self.file_id = file_id
        # 商品标题，最长64个字符
        self.title = title
        # 商品名称
        self.goods_name = goods_name
        # 商品分类
        self.classification = classification
        # 售价（分）
        self.standard_price_in_cent = standard_price_in_cent
        # 上架/下架，默认上架
        self.goods_status = goods_status
        # 发布时间，默认直接发布
        self.publish_time = publish_time
        # 授权期限起始时间
        self.auth_start_time = auth_start_time
        # 授权期限结束时间（传-1 则为永久）
        self.auth_end_time = auth_end_time
        # 是否是作者
        self.is_author = is_author
        # 作者姓名，如果isAuthor为false则必填，最长30个字符
        self.author_cert_name = author_cert_name
        # 作者身份证号,如果isAuthor为false则必填
        self.author_cert_no = author_cert_no
        # 幂等号，可以保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        self.client_token = client_token
        # 授权信息
        self.auth_info = auth_info

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.title, 'title')
        self.validate_required(self.goods_name, 'goods_name')
        self.validate_required(self.standard_price_in_cent, 'standard_price_in_cent')
        self.validate_required(self.auth_start_time, 'auth_start_time')
        self.validate_required(self.auth_end_time, 'auth_end_time')
        self.validate_required(self.is_author, 'is_author')
        self.validate_required(self.auth_info, 'auth_info')
        if self.auth_info:
            for k in self.auth_info:
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
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.title is not None:
            result['title'] = self.title
        if self.goods_name is not None:
            result['goods_name'] = self.goods_name
        if self.classification is not None:
            result['classification'] = self.classification
        if self.standard_price_in_cent is not None:
            result['standard_price_in_cent'] = self.standard_price_in_cent
        if self.goods_status is not None:
            result['goods_status'] = self.goods_status
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.auth_start_time is not None:
            result['auth_start_time'] = self.auth_start_time
        if self.auth_end_time is not None:
            result['auth_end_time'] = self.auth_end_time
        if self.is_author is not None:
            result['is_author'] = self.is_author
        if self.author_cert_name is not None:
            result['author_cert_name'] = self.author_cert_name
        if self.author_cert_no is not None:
            result['author_cert_no'] = self.author_cert_no
        if self.client_token is not None:
            result['client_token'] = self.client_token
        result['auth_info'] = []
        if self.auth_info is not None:
            for k in self.auth_info:
                result['auth_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('goods_name') is not None:
            self.goods_name = m.get('goods_name')
        if m.get('classification') is not None:
            self.classification = m.get('classification')
        if m.get('standard_price_in_cent') is not None:
            self.standard_price_in_cent = m.get('standard_price_in_cent')
        if m.get('goods_status') is not None:
            self.goods_status = m.get('goods_status')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('auth_start_time') is not None:
            self.auth_start_time = m.get('auth_start_time')
        if m.get('auth_end_time') is not None:
            self.auth_end_time = m.get('auth_end_time')
        if m.get('is_author') is not None:
            self.is_author = m.get('is_author')
        if m.get('author_cert_name') is not None:
            self.author_cert_name = m.get('author_cert_name')
        if m.get('author_cert_no') is not None:
            self.author_cert_no = m.get('author_cert_no')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        self.auth_info = []
        if m.get('auth_info') is not None:
            for k in m.get('auth_info'):
                temp_model = AuthInfo()
                self.auth_info.append(temp_model.from_map(k))
        return self


class PublishGoodResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pubilsh_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发布id
        self.pubilsh_id = pubilsh_id

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
        if self.pubilsh_id is not None:
            result['pubilsh_id'] = self.pubilsh_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pubilsh_id') is not None:
            self.pubilsh_id = m.get('pubilsh_id')
        return self


class QueryGoodsPublishRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        pubilsh_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发布id
        self.pubilsh_id = pubilsh_id

    def validate(self):
        self.validate_required(self.pubilsh_id, 'pubilsh_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.pubilsh_id is not None:
            result['pubilsh_id'] = self.pubilsh_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('pubilsh_id') is not None:
            self.pubilsh_id = m.get('pubilsh_id')
        return self


class QueryGoodsPublishResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pubilsh_id: str = None,
        publish_status: str = None,
        goods_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发布id
        self.pubilsh_id = pubilsh_id
        # 发布状态
        self.publish_status = publish_status
        # 商品id
        self.goods_id = goods_id

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
        if self.pubilsh_id is not None:
            result['pubilsh_id'] = self.pubilsh_id
        if self.publish_status is not None:
            result['publish_status'] = self.publish_status
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pubilsh_id') is not None:
            self.pubilsh_id = m.get('pubilsh_id')
        if m.get('publish_status') is not None:
            self.publish_status = m.get('publish_status')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        return self


class UpdateGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        goods_id: str = None,
        standard_price_in_cent: int = None,
        goods_status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品id
        self.goods_id = goods_id
        # 商品价格（分）
        self.standard_price_in_cent = standard_price_in_cent
        # 商品状态:上架，下架
        self.goods_status = goods_status

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.standard_price_in_cent is not None:
            result['standard_price_in_cent'] = self.standard_price_in_cent
        if self.goods_status is not None:
            result['goods_status'] = self.goods_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('standard_price_in_cent') is not None:
            self.standard_price_in_cent = m.get('standard_price_in_cent')
        if m.get('goods_status') is not None:
            self.goods_status = m.get('goods_status')
        return self


class UpdateGoodsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class QueryGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        goods_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品id
        self.goods_id = goods_id

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        return self


class QueryGoodsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        goods_info: GoodsInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品信息
        self.goods_info = goods_info

    def validate(self):
        if self.goods_info:
            self.goods_info.validate()

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
        if self.goods_info is not None:
            result['goods_info'] = self.goods_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('goods_info') is not None:
            temp_model = GoodsInfo()
            self.goods_info = temp_model.from_map(m['goods_info'])
        return self


