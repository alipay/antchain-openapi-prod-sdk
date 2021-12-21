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


class ScreenInfo(TeaModel):
    def __init__(
        self,
        process_log_file: str = None,
        check_log_file: str = None,
        web_screenshot_file: str = None,
        web_source_file: str = None,
        video_file: str = None,
        process_log_file_tx_hash: str = None,
        check_log_file_tx_hash: str = None,
    ):
        # 全链路取证日志文件下载链接
        self.process_log_file = process_log_file
        # 自清洁文件下载地址
        self.check_log_file = check_log_file
        # 网页截图文件下载链接
        self.web_screenshot_file = web_screenshot_file
        # 网页源码文件下载链接
        self.web_source_file = web_source_file
        # 视频源文件下载链接
        self.video_file = video_file
        # 操作日志交易hash
        self.process_log_file_tx_hash = process_log_file_tx_hash
        # 自清洁日志交易hash
        self.check_log_file_tx_hash = check_log_file_tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.process_log_file is not None:
            result['process_log_file'] = self.process_log_file
        if self.check_log_file is not None:
            result['check_log_file'] = self.check_log_file
        if self.web_screenshot_file is not None:
            result['web_screenshot_file'] = self.web_screenshot_file
        if self.web_source_file is not None:
            result['web_source_file'] = self.web_source_file
        if self.video_file is not None:
            result['video_file'] = self.video_file
        if self.process_log_file_tx_hash is not None:
            result['process_log_file_tx_hash'] = self.process_log_file_tx_hash
        if self.check_log_file_tx_hash is not None:
            result['check_log_file_tx_hash'] = self.check_log_file_tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('process_log_file') is not None:
            self.process_log_file = m.get('process_log_file')
        if m.get('check_log_file') is not None:
            self.check_log_file = m.get('check_log_file')
        if m.get('web_screenshot_file') is not None:
            self.web_screenshot_file = m.get('web_screenshot_file')
        if m.get('web_source_file') is not None:
            self.web_source_file = m.get('web_source_file')
        if m.get('video_file') is not None:
            self.video_file = m.get('video_file')
        if m.get('process_log_file_tx_hash') is not None:
            self.process_log_file_tx_hash = m.get('process_log_file_tx_hash')
        if m.get('check_log_file_tx_hash') is not None:
            self.check_log_file_tx_hash = m.get('check_log_file_tx_hash')
        return self


class ScreenshotInfo(TeaModel):
    def __init__(
        self,
        process_log_file: str = None,
        check_log_file: str = None,
        screenshot_file: str = None,
        process_log_file_tx_hash: str = None,
        check_log_file_tx_hash: str = None,
    ):
        # 全链路取证日志文件下载链接
        self.process_log_file = process_log_file
        # 自清洁文件下载链接
        self.check_log_file = check_log_file
        # 网页截图文件下载链接
        self.screenshot_file = screenshot_file
        # 操作日志文件交易hash
        self.process_log_file_tx_hash = process_log_file_tx_hash
        # 自清洁日志文件交易hash
        self.check_log_file_tx_hash = check_log_file_tx_hash

    def validate(self):
        self.validate_required(self.screenshot_file, 'screenshot_file')

    def to_map(self):
        result = dict()
        if self.process_log_file is not None:
            result['process_log_file'] = self.process_log_file
        if self.check_log_file is not None:
            result['check_log_file'] = self.check_log_file
        if self.screenshot_file is not None:
            result['screenshot_file'] = self.screenshot_file
        if self.process_log_file_tx_hash is not None:
            result['process_log_file_tx_hash'] = self.process_log_file_tx_hash
        if self.check_log_file_tx_hash is not None:
            result['check_log_file_tx_hash'] = self.check_log_file_tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('process_log_file') is not None:
            self.process_log_file = m.get('process_log_file')
        if m.get('check_log_file') is not None:
            self.check_log_file = m.get('check_log_file')
        if m.get('screenshot_file') is not None:
            self.screenshot_file = m.get('screenshot_file')
        if m.get('process_log_file_tx_hash') is not None:
            self.process_log_file_tx_hash = m.get('process_log_file_tx_hash')
        if m.get('check_log_file_tx_hash') is not None:
            self.check_log_file_tx_hash = m.get('check_log_file_tx_hash')
        return self


class NotaryPublicOffice(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        province: str = None,
        city: str = None,
    ):
        # 公证处code
        self.code = code
        # 公证处名称
        self.name = name
        # 公证处所在省（直辖市）
        self.province = province
        # 公证处所在市
        self.city = city

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.province, 'province')
        self.validate_required(self.city, 'city')

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.province is not None:
            result['province'] = self.province
        if self.city is not None:
            result['city'] = self.city
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

    def validate(self):
        self.validate_required(self.gmt_end, 'gmt_end')
        self.validate_required(self.gmt_start, 'gmt_start')
        self.validate_required(self.os_version, 'os_version')
        if self.screen_info:
            self.screen_info.validate()
        self.validate_required(self.sw_version, 'sw_version')

    def to_map(self):
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

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.gmt_evidence, 'gmt_evidence')
        if self.screenshot_info:
            self.screenshot_info.validate()

    def to_map(self):
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


class RightsInfo(TeaModel):
    def __init__(
        self,
        work_name: str = None,
        work_type: str = None,
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
        # 作品名称（最长128个字符）
        self.work_name = work_name
        # 作品类型
        self.work_type = work_type
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
        self.validate_required(self.work_name, 'work_name')
        if self.work_name is not None:
            self.validate_max_length(self.work_name, 'work_name', 128)
        self.validate_required(self.work_type, 'work_type')
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
        result = dict()
        if self.work_name is not None:
            result['work_name'] = self.work_name
        if self.work_type is not None:
            result['work_type'] = self.work_type
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
        if m.get('work_name') is not None:
            self.work_name = m.get('work_name')
        if m.get('work_type') is not None:
            self.work_type = m.get('work_type')
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
        # 当status为failure时的具体错误信息
        self.failure_msg = failure_msg

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
        proxy_info: ProxyData = None,
        phone_num: str = None,
        feature_file_id: str = None,
        client_token: str = None,
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
        # 代理信息
        self.proxy_info = proxy_info
        # 电话号码
        self.phone_num = phone_num
        # 特征文件oss id
        self.feature_file_id = feature_file_id
        # 幂等字段
        self.client_token = client_token

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
        if self.proxy_info:
            self.proxy_info.validate()

    def to_map(self):
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
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.feature_file_id is not None:
            result['feature_file_id'] = self.feature_file_id
        if self.client_token is not None:
            result['client_token'] = self.client_token
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
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('feature_file_id') is not None:
            self.feature_file_id = m.get('feature_file_id')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
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
        client_token: str = None,
        proxy_info: ProxyData = None,
        sync_info: AccountData = None,
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
        # 幂等
        self.client_token = client_token
        # 代理信息
        self.proxy_info = proxy_info
        # 同步账号信息
        self.sync_info = sync_info

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
        if self.proxy_info:
            self.proxy_info.validate()
        if self.sync_info:
            self.sync_info.validate()

    def to_map(self):
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
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.proxy_info is not None:
            result['proxy_info'] = self.proxy_info.to_map()
        if self.sync_info is not None:
            result['sync_info'] = self.sync_info.to_map()
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
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('proxy_info') is not None:
            temp_model = ProxyData()
            self.proxy_info = temp_model.from_map(m['proxy_info'])
        if m.get('sync_info') is not None:
            temp_model = AccountData()
            self.sync_info = temp_model.from_map(m['sync_info'])
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
        statement_url: str = None,
        statement_tx_hash: str = None,
        register_person_tx_hash: str = None,
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
        # 权利声明书下载地址 注意只有传递了权利信息并且生成了权利声明书才会返回
        self.statement_url = statement_url
        # 权利声明书存证交易HASH  注意只有传递了权利信息并且生成了权利声明书才会返回
        self.statement_tx_hash = statement_tx_hash
        # 登记人信息存证交易HASH
        self.register_person_tx_hash = register_person_tx_hash
        # 安全信息
        self.security = security

    def validate(self):
        if self.security:
            self.security.validate()

    def to_map(self):
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
        if self.statement_url is not None:
            result['statement_url'] = self.statement_url
        if self.statement_tx_hash is not None:
            result['statement_tx_hash'] = self.statement_tx_hash
        if self.register_person_tx_hash is not None:
            result['register_person_tx_hash'] = self.register_person_tx_hash
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
        if m.get('statement_url') is not None:
            self.statement_url = m.get('statement_url')
        if m.get('statement_tx_hash') is not None:
            self.statement_tx_hash = m.get('statement_tx_hash')
        if m.get('register_person_tx_hash') is not None:
            self.register_person_tx_hash = m.get('register_person_tx_hash')
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
        file_id: str = None,
        user_data: VerifyUserData = None,
        statement_data: VerifyStatementData = None,
        evidence_data: VerifyEvidenceData = None,
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
        # 文件OSS Id（上传文件有大小限制，文本文件最大100M，图片最大1G，视频和压缩包最大2G）
        # 
        # (和fileHash 二选一，必传一个，都传按fileHash为准)
        self.file_id = file_id
        # 核验用户信息
        self.user_data = user_data
        # 核验权利声明信息
        self.statement_data = statement_data
        # 核验取证信息
        self.evidence_data = evidence_data

    def validate(self):
        self.validate_required(self.tx_hash, 'tx_hash')
        if self.user_data:
            self.user_data.validate()
        if self.statement_data:
            self.statement_data.validate()
        if self.evidence_data:
            self.evidence_data.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.user_data is not None:
            result['user_data'] = self.user_data.to_map()
        if self.statement_data is not None:
            result['statement_data'] = self.statement_data.to_map()
        if self.evidence_data is not None:
            result['evidence_data'] = self.evidence_data.to_map()
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
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('user_data') is not None:
            temp_model = VerifyUserData()
            self.user_data = temp_model.from_map(m['user_data'])
        if m.get('statement_data') is not None:
            temp_model = VerifyStatementData()
            self.statement_data = temp_model.from_map(m['statement_data'])
        if m.get('evidence_data') is not None:
            temp_model = VerifyEvidenceData()
            self.evidence_data = temp_model.from_map(m['evidence_data'])
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
        # 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_name = agent_name
        # 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
        self.agent_no = agent_no
        # 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630 或 (86)13738258505
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


