# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


class Config(TeaModel):
    """
    Model for initing client
    """
    def __init__(self, access_key_id=None, access_key_secret=None, security_token=None, protocol=None,
                 read_timeout=None, connect_timeout=None, http_proxy=None, https_proxy=None, endpoint=None, no_proxy=None,
                 max_idle_conns=None, user_agent=None, socks_5proxy=None, socks_5net_work=None):
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

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['accessKeyId'] = self.access_key_id
        result['accessKeySecret'] = self.access_key_secret
        result['securityToken'] = self.security_token
        result['protocol'] = self.protocol
        result['readTimeout'] = self.read_timeout
        result['connectTimeout'] = self.connect_timeout
        result['httpProxy'] = self.http_proxy
        result['httpsProxy'] = self.https_proxy
        result['endpoint'] = self.endpoint
        result['noProxy'] = self.no_proxy
        result['maxIdleConns'] = self.max_idle_conns
        result['userAgent'] = self.user_agent
        result['socks5Proxy'] = self.socks_5proxy
        result['socks5NetWork'] = self.socks_5net_work
        return result

    def from_map(self, map={}):
        self.access_key_id = map.get('accessKeyId')
        self.access_key_secret = map.get('accessKeySecret')
        self.security_token = map.get('securityToken')
        self.protocol = map.get('protocol')
        self.read_timeout = map.get('readTimeout')
        self.connect_timeout = map.get('connectTimeout')
        self.http_proxy = map.get('httpProxy')
        self.https_proxy = map.get('httpsProxy')
        self.endpoint = map.get('endpoint')
        self.no_proxy = map.get('noProxy')
        self.max_idle_conns = map.get('maxIdleConns')
        self.user_agent = map.get('userAgent')
        self.socks_5proxy = map.get('socks5Proxy')
        self.socks_5net_work = map.get('socks5NetWork')
        return self


class Cert(TeaModel):
    def __init__(self, cert_code=None, cert_description=None, cert_end_time=None, cert_id=None, cert_name_cn=None,
                 cert_name_en=None, cert_publish_time=None, cert_publish_time_zone=None, cert_start_time=None, cert_status=None,
                 cert_summary=None, cert_url=None, country=None, expire_type=None, feature_url=None, holder_avatar=None,
                 holder_name=None, level=None, org_did=None, org_name=None, org_user_id=None, primary_id_no=None,
                 second_id_no_1=None, second_id_no_2=None, second_id_no_3=None, type=None):
        # 证书编号
        self.cert_code = cert_code
        # 证书描述
        self.cert_description = cert_description
        # 时间周期结束时间
        self.cert_end_time = cert_end_time
        # 证书id
        self.cert_id = cert_id
        # 证书名称-中文
        self.cert_name_cn = cert_name_cn
        # 证书名称-英文（拼音）
        self.cert_name_en = cert_name_en
        # 首次发布时间
        self.cert_publish_time = cert_publish_time
        # 发布时间时区，默认UTC+8
        # 
        self.cert_publish_time_zone = cert_publish_time_zone
        # 时间周期开始时间
        self.cert_start_time = cert_start_time
        # 1-有效
        # 2-冻结
        # 3-失效
        # 4-作废
        # 5-其他
        self.cert_status = cert_status
        # 证书概述
        self.cert_summary = cert_summary
        # 实体证书图片url
        self.cert_url = cert_url
        # 证书归属国家
        # 使用“ISO 3166-1”代码表-数字码
        # https://zh.wikipedia.org/wiki/ISO_3166-1
        self.country = country
        # 1.长期有效
        # 2.时间周期
        self.expire_type = expire_type
        # 其他信息文件url
        self.feature_url = feature_url
        # 持有人的人脸图像url
        self.holder_avatar = holder_avatar
        # 证书持有人姓名
        self.holder_name = holder_name
        # 证书等级类型：
        # 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
        self.level = level
        # 企业did
        self.org_did = org_did
        # 企业名称
        self.org_name = org_name
        # 证书持有人id
        self.org_user_id = org_user_id
        # 持有人主证件编号，无身份证的个人使用0000000000000000
        self.primary_id_no = primary_id_no
        # 持有人辅助证件编号-1
        self.second_id_no_1 = second_id_no_1
        # 持有人辅助证件编号-2
        self.second_id_no_2 = second_id_no_2
        # 持有人辅助证件编号-3
        self.second_id_no_3 = second_id_no_3
        # -数字码类型为156时可使用如下类目：
        # --学历证书-XLZ
        # --职业证书--ZYZ
        # -其他国家传入--QT
        self.type = type

    def validate(self):
        if self.cert_code:
            self.validate_max_length(self.cert_code, 'cert_code', 64)
        if self.cert_end_time:
            self.validate_pattern(self.cert_end_time, 'cert_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.cert_id:
            self.validate_max_length(self.cert_id, 'cert_id', 128)
        if self.cert_name_cn:
            self.validate_max_length(self.cert_name_cn, 'cert_name_cn', 64)
        if self.cert_publish_time:
            self.validate_pattern(self.cert_publish_time, 'cert_publish_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.cert_start_time:
            self.validate_pattern(self.cert_start_time, 'cert_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.cert_url:
            self.validate_max_length(self.cert_url, 'cert_url', 256)
        if self.country:
            self.validate_max_length(self.country, 'country', 32)
        if self.feature_url:
            self.validate_max_length(self.feature_url, 'feature_url', 512)
        if self.holder_avatar:
            self.validate_max_length(self.holder_avatar, 'holder_avatar', 256)
        if self.holder_name:
            self.validate_max_length(self.holder_name, 'holder_name', 64)
        if self.level:
            self.validate_max_length(self.level, 'level', 32)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.org_name:
            self.validate_max_length(self.org_name, 'org_name', 64)
        if self.org_user_id:
            self.validate_max_length(self.org_user_id, 'org_user_id', 128)
        if self.primary_id_no:
            self.validate_max_length(self.primary_id_no, 'primary_id_no', 64)
        if self.second_id_no_1:
            self.validate_max_length(self.second_id_no_1, 'second_id_no_1', 64)
        if self.second_id_no_2:
            self.validate_max_length(self.second_id_no_2, 'second_id_no_2', 64)
        if self.second_id_no_3:
            self.validate_max_length(self.second_id_no_3, 'second_id_no_3', 64)

    def to_map(self):
        result = {}
        result['cert_code'] = self.cert_code
        result['cert_description'] = self.cert_description
        result['cert_end_time'] = self.cert_end_time
        result['cert_id'] = self.cert_id
        result['cert_name_cn'] = self.cert_name_cn
        result['cert_name_en'] = self.cert_name_en
        result['cert_publish_time'] = self.cert_publish_time
        result['cert_publish_time_zone'] = self.cert_publish_time_zone
        result['cert_start_time'] = self.cert_start_time
        result['cert_status'] = self.cert_status
        result['cert_summary'] = self.cert_summary
        result['cert_url'] = self.cert_url
        result['country'] = self.country
        result['expire_type'] = self.expire_type
        result['feature_url'] = self.feature_url
        result['holder_avatar'] = self.holder_avatar
        result['holder_name'] = self.holder_name
        result['level'] = self.level
        result['org_did'] = self.org_did
        result['org_name'] = self.org_name
        result['org_user_id'] = self.org_user_id
        result['primary_id_no'] = self.primary_id_no
        result['second_id_no_1'] = self.second_id_no_1
        result['second_id_no_2'] = self.second_id_no_2
        result['second_id_no_3'] = self.second_id_no_3
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.cert_code = map.get('cert_code')
        self.cert_description = map.get('cert_description')
        self.cert_end_time = map.get('cert_end_time')
        self.cert_id = map.get('cert_id')
        self.cert_name_cn = map.get('cert_name_cn')
        self.cert_name_en = map.get('cert_name_en')
        self.cert_publish_time = map.get('cert_publish_time')
        self.cert_publish_time_zone = map.get('cert_publish_time_zone')
        self.cert_start_time = map.get('cert_start_time')
        self.cert_status = map.get('cert_status')
        self.cert_summary = map.get('cert_summary')
        self.cert_url = map.get('cert_url')
        self.country = map.get('country')
        self.expire_type = map.get('expire_type')
        self.feature_url = map.get('feature_url')
        self.holder_avatar = map.get('holder_avatar')
        self.holder_name = map.get('holder_name')
        self.level = map.get('level')
        self.org_did = map.get('org_did')
        self.org_name = map.get('org_name')
        self.org_user_id = map.get('org_user_id')
        self.primary_id_no = map.get('primary_id_no')
        self.second_id_no_1 = map.get('second_id_no_1')
        self.second_id_no_2 = map.get('second_id_no_2')
        self.second_id_no_3 = map.get('second_id_no_3')
        self.type = map.get('type')
        return self


class OrgUser(TeaModel):
    def __init__(self, org_did=None, org_user_id=None):
        # 企业did
        self.org_did = org_did
        # 企业用户id
        self.org_user_id = org_user_id

    def validate(self):
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.org_user_id:
            self.validate_max_length(self.org_user_id, 'org_user_id', 128)

    def to_map(self):
        result = {}
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        return self


class PrivacyDesc(TeaModel):
    def __init__(self, attribute_name=None, privacy_level=None):
        # 属性名称
        # 
        self.attribute_name = attribute_name
        # 隐私等级：
        # 1：数据可以全量明文查询
        # 2：数据仅可以通过数据比较查询
        self.privacy_level = privacy_level

    def validate(self):
        if self.attribute_name:
            self.validate_max_length(self.attribute_name, 'attribute_name', 64)

    def to_map(self):
        result = {}
        result['attribute_name'] = self.attribute_name
        result['privacy_level'] = self.privacy_level
        return result

    def from_map(self, map={}):
        self.attribute_name = map.get('attribute_name')
        self.privacy_level = map.get('privacy_level')
        return self


class Class(TeaModel):
    def __init__(self, class_id=None, org_did=None):
        # 班级id
        self.class_id = class_id
        # 企业did
        self.org_did = org_did

    def validate(self):
        if self.class_id:
            self.validate_max_length(self.class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        return self


class ProxyDesc(TeaModel):
    def __init__(self, attribute_name=None, is_proxy=None):
        # 属性名称
        self.attribute_name = attribute_name
        # 是否托管
        self.is_proxy = is_proxy

    def validate(self):
        if self.attribute_name:
            self.validate_max_length(self.attribute_name, 'attribute_name', 64)

    def to_map(self):
        result = {}
        result['attribute_name'] = self.attribute_name
        result['is_proxy'] = self.is_proxy
        return result

    def from_map(self, map={}):
        self.attribute_name = map.get('attribute_name')
        self.is_proxy = map.get('is_proxy')
        return self


class PublicDesc(TeaModel):
    def __init__(self, attribute_name=None, is_public=None):
        # 属性名称
        self.attribute_name = attribute_name
        # 数据是否所有消费方可查询
        self.is_public = is_public

    def validate(self):
        if self.attribute_name:
            self.validate_max_length(self.attribute_name, 'attribute_name', 64)

    def to_map(self):
        result = {}
        result['attribute_name'] = self.attribute_name
        result['is_public'] = self.is_public
        return result

    def from_map(self, map={}):
        self.attribute_name = map.get('attribute_name')
        self.is_public = map.get('is_public')
        return self


class CreateBaasEbcOrganizationRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, org_code=None, org_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 企业码
        self.org_code = org_code
        # 企业名称
        self.org_name = org_name

    def validate(self):
        if self.org_code:
            self.validate_max_length(self.org_code, 'org_code', 64)
        if self.org_name:
            self.validate_max_length(self.org_name, 'org_name', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['org_code'] = self.org_code
        result['org_name'] = self.org_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.org_code = map.get('org_code')
        self.org_name = map.get('org_name')
        return self


class CreateBaasEbcOrganizationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, org_did=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 企业did
        self.org_did = org_did

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.org_did = map.get('org_did')
        return self


class CreateBaasEbcPersonRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, person_name=None,
                 primary_id_no=None, privacy_desc_list=None, proxy_desc_list=None, public_desc_list=None, second_id_no_1=None,
                 second_id_no_2=None, second_id_no_3=None, secret_key=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 姓名
        self.person_name = person_name
        # 持有人主证件编号，无身份证的个人使用0000000000000000
        # 请使用我们提供的公钥对数据进行加密
        self.primary_id_no = primary_id_no
        # 隐私属性描述列表
        # 
        self.privacy_desc_list = privacy_desc_list
        # 托管属性描述列表
        # 
        self.proxy_desc_list = proxy_desc_list
        # 公开属性描述列表
        # 
        self.public_desc_list = public_desc_list
        # 持有人辅助证件编号-1
        # 请使用我们提供的公钥对数据进行加密
        self.second_id_no_1 = second_id_no_1
        # 持有人辅助证件编号-1
        # 请使用我们提供的公钥对数据进行加密
        self.second_id_no_2 = second_id_no_2
        # 持有人辅助证件编号-3
        # 请使用我们提供的公钥对数据进行加密
        self.second_id_no_3 = second_id_no_3
        # 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
        self.secret_key = secret_key

    def validate(self):
        if self.person_name:
            self.validate_max_length(self.person_name, 'person_name', 32)
        if self.primary_id_no:
            self.validate_max_length(self.primary_id_no, 'primary_id_no', 1024)
        if self.privacy_desc_list:
            for k in self.privacy_desc_list:
                if k:
                    k.validate()
        if self.proxy_desc_list:
            for k in self.proxy_desc_list:
                if k:
                    k.validate()
        if self.public_desc_list:
            for k in self.public_desc_list:
                if k:
                    k.validate()
        if self.second_id_no_1:
            self.validate_max_length(self.second_id_no_1, 'second_id_no_1', 1024)
        if self.second_id_no_2:
            self.validate_max_length(self.second_id_no_2, 'second_id_no_2', 1024)
        if self.second_id_no_3:
            self.validate_max_length(self.second_id_no_3, 'second_id_no_3', 1024)
        if self.secret_key:
            self.validate_max_length(self.secret_key, 'secret_key', 512)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['person_name'] = self.person_name
        result['primary_id_no'] = self.primary_id_no
        result['privacy_desc_list'] = []
        if self.privacy_desc_list is not None:
            for k in self.privacy_desc_list:
                result['privacy_desc_list'].append(k.to_map() if k else None)
        else:
            result['privacy_desc_list'] = None
        result['proxy_desc_list'] = []
        if self.proxy_desc_list is not None:
            for k in self.proxy_desc_list:
                result['proxy_desc_list'].append(k.to_map() if k else None)
        else:
            result['proxy_desc_list'] = None
        result['public_desc_list'] = []
        if self.public_desc_list is not None:
            for k in self.public_desc_list:
                result['public_desc_list'].append(k.to_map() if k else None)
        else:
            result['public_desc_list'] = None
        result['second_id_no_1'] = self.second_id_no_1
        result['second_id_no_2'] = self.second_id_no_2
        result['second_id_no_3'] = self.second_id_no_3
        result['secret_key'] = self.secret_key
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.person_name = map.get('person_name')
        self.primary_id_no = map.get('primary_id_no')
        self.privacy_desc_list = []
        if map.get('privacy_desc_list') is not None:
            for k in map.get('privacy_desc_list'):
                temp_model = PrivacyDesc()
                self.privacy_desc_list.append(temp_model.from_map(k))
        else:
            self.privacy_desc_list = None
        self.proxy_desc_list = []
        if map.get('proxy_desc_list') is not None:
            for k in map.get('proxy_desc_list'):
                temp_model = ProxyDesc()
                self.proxy_desc_list.append(temp_model.from_map(k))
        else:
            self.proxy_desc_list = None
        self.public_desc_list = []
        if map.get('public_desc_list') is not None:
            for k in map.get('public_desc_list'):
                temp_model = PublicDesc()
                self.public_desc_list.append(temp_model.from_map(k))
        else:
            self.public_desc_list = None
        self.second_id_no_1 = map.get('second_id_no_1')
        self.second_id_no_2 = map.get('second_id_no_2')
        self.second_id_no_3 = map.get('second_id_no_3')
        self.secret_key = map.get('secret_key')
        return self


class CreateBaasEbcPersonResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, person_did=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 个人id
        self.person_did = person_did

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['person_did'] = self.person_did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.person_did = map.get('person_did')
        return self


class CreateBaasEbcOrganizationUserRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, org_did=None, person_did=None,
                 uid=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 企业id
        self.org_did = org_did
        # 个人id
        self.person_did = person_did
        # 机构内部用户工号
        self.uid = uid

    def validate(self):
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.person_did:
            self.validate_max_length(self.person_did, 'person_did', 128)
        if self.uid:
            self.validate_max_length(self.uid, 'uid', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['org_did'] = self.org_did
        result['person_did'] = self.person_did
        result['uid'] = self.uid
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.org_did = map.get('org_did')
        self.person_did = map.get('person_did')
        self.uid = map.get('uid')
        return self


class CreateBaasEbcOrganizationUserResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, org_user_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 机构内用户id
        self.org_user_id = org_user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.org_user_id = map.get('org_user_id')
        return self


class CancelBaasEbcPersonRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, person_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 个人id
        self.person_did = person_did

    def validate(self):
        if self.person_did:
            self.validate_max_length(self.person_did, 'person_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['person_did'] = self.person_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.person_did = map.get('person_did')
        return self


class CancelBaasEbcPersonResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class ResumeBaasEbcPersonRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, person_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 个人did
        self.person_did = person_did

    def validate(self):
        if self.person_did:
            self.validate_max_length(self.person_did, 'person_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['person_did'] = self.person_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.person_did = map.get('person_did')
        return self


class ResumeBaasEbcPersonResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class CreateBaasEbcOrganizationClassRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, capacity=None,
                 class_end_time=None, class_name=None, class_start_time=None, class_status=None, org_did=None,
                 privacy_desc_list=None, proxy_desc_list=None, public_desc_list=None, secret_key=None, type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 班级容量
        self.capacity = capacity
        # 结束时间
        self.class_end_time = class_end_time
        # 班级名称
        self.class_name = class_name
        # 开始时间
        self.class_start_time = class_start_time
        # 1:有效、2:暂停、3:失效
        self.class_status = class_status
        # 企业id
        self.org_did = org_did
        # 隐私属性描述列表
        # 
        self.privacy_desc_list = privacy_desc_list
        # 托管属性描述列表
        # 
        self.proxy_desc_list = proxy_desc_list
        # 公开属性描述列表
        # 
        self.public_desc_list = public_desc_list
        # 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
        self.secret_key = secret_key
        # 1线上、2线下、3混合
        self.type = type

    def validate(self):
        if self.class_end_time:
            self.validate_pattern(self.class_end_time, 'class_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.class_name:
            self.validate_max_length(self.class_name, 'class_name', 64)
        if self.class_start_time:
            self.validate_pattern(self.class_start_time, 'class_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.privacy_desc_list:
            for k in self.privacy_desc_list:
                if k:
                    k.validate()
        if self.proxy_desc_list:
            for k in self.proxy_desc_list:
                if k:
                    k.validate()
        if self.public_desc_list:
            for k in self.public_desc_list:
                if k:
                    k.validate()
        if self.secret_key:
            self.validate_max_length(self.secret_key, 'secret_key', 512)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['capacity'] = self.capacity
        result['class_end_time'] = self.class_end_time
        result['class_name'] = self.class_name
        result['class_start_time'] = self.class_start_time
        result['class_status'] = self.class_status
        result['org_did'] = self.org_did
        result['privacy_desc_list'] = []
        if self.privacy_desc_list is not None:
            for k in self.privacy_desc_list:
                result['privacy_desc_list'].append(k.to_map() if k else None)
        else:
            result['privacy_desc_list'] = None
        result['proxy_desc_list'] = []
        if self.proxy_desc_list is not None:
            for k in self.proxy_desc_list:
                result['proxy_desc_list'].append(k.to_map() if k else None)
        else:
            result['proxy_desc_list'] = None
        result['public_desc_list'] = []
        if self.public_desc_list is not None:
            for k in self.public_desc_list:
                result['public_desc_list'].append(k.to_map() if k else None)
        else:
            result['public_desc_list'] = None
        result['secret_key'] = self.secret_key
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.capacity = map.get('capacity')
        self.class_end_time = map.get('class_end_time')
        self.class_name = map.get('class_name')
        self.class_start_time = map.get('class_start_time')
        self.class_status = map.get('class_status')
        self.org_did = map.get('org_did')
        self.privacy_desc_list = []
        if map.get('privacy_desc_list') is not None:
            for k in map.get('privacy_desc_list'):
                temp_model = PrivacyDesc()
                self.privacy_desc_list.append(temp_model.from_map(k))
        else:
            self.privacy_desc_list = None
        self.proxy_desc_list = []
        if map.get('proxy_desc_list') is not None:
            for k in map.get('proxy_desc_list'):
                temp_model = ProxyDesc()
                self.proxy_desc_list.append(temp_model.from_map(k))
        else:
            self.proxy_desc_list = None
        self.public_desc_list = []
        if map.get('public_desc_list') is not None:
            for k in map.get('public_desc_list'):
                temp_model = PublicDesc()
                self.public_desc_list.append(temp_model.from_map(k))
        else:
            self.public_desc_list = None
        self.secret_key = map.get('secret_key')
        self.type = map.get('type')
        return self


class CreateBaasEbcOrganizationClassResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, class_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 班级id
        self.class_id = class_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['class_id'] = self.class_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.class_id = map.get('class_id')
        return self


class UpdateBaasEbcOrganizationClassRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, capacity=None,
                 class_end_time=None, class_id=None, class_name=None, class_start_time=None, class_status=None, org_did=None,
                 privacy_desc_list=None, proxy_desc_list=None, public_desc_list=None, secret_key=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 容量
        self.capacity = capacity
        # 结束时间
        self.class_end_time = class_end_time
        # 班级id
        self.class_id = class_id
        # 班级名称
        self.class_name = class_name
        # 开始时间
        self.class_start_time = class_start_time
        # 1:有效、2:暂停、3:失效
        self.class_status = class_status
        # 企业did
        self.org_did = org_did
        # 隐私属性描述列表
        # 
        self.privacy_desc_list = privacy_desc_list
        # 托管属性描述列表
        # 
        self.proxy_desc_list = proxy_desc_list
        # 公开属性描述列表
        # 
        self.public_desc_list = public_desc_list
        # 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
        self.secret_key = secret_key

    def validate(self):
        if self.class_end_time:
            self.validate_pattern(self.class_end_time, 'class_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.class_id:
            self.validate_max_length(self.class_id, 'class_id', 128)
        if self.class_name:
            self.validate_max_length(self.class_name, 'class_name', 64)
        if self.class_start_time:
            self.validate_pattern(self.class_start_time, 'class_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.privacy_desc_list:
            for k in self.privacy_desc_list:
                if k:
                    k.validate()
        if self.proxy_desc_list:
            for k in self.proxy_desc_list:
                if k:
                    k.validate()
        if self.public_desc_list:
            for k in self.public_desc_list:
                if k:
                    k.validate()
        if self.secret_key:
            self.validate_max_length(self.secret_key, 'secret_key', 512)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['capacity'] = self.capacity
        result['class_end_time'] = self.class_end_time
        result['class_id'] = self.class_id
        result['class_name'] = self.class_name
        result['class_start_time'] = self.class_start_time
        result['class_status'] = self.class_status
        result['org_did'] = self.org_did
        result['privacy_desc_list'] = []
        if self.privacy_desc_list is not None:
            for k in self.privacy_desc_list:
                result['privacy_desc_list'].append(k.to_map() if k else None)
        else:
            result['privacy_desc_list'] = None
        result['proxy_desc_list'] = []
        if self.proxy_desc_list is not None:
            for k in self.proxy_desc_list:
                result['proxy_desc_list'].append(k.to_map() if k else None)
        else:
            result['proxy_desc_list'] = None
        result['public_desc_list'] = []
        if self.public_desc_list is not None:
            for k in self.public_desc_list:
                result['public_desc_list'].append(k.to_map() if k else None)
        else:
            result['public_desc_list'] = None
        result['secret_key'] = self.secret_key
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.capacity = map.get('capacity')
        self.class_end_time = map.get('class_end_time')
        self.class_id = map.get('class_id')
        self.class_name = map.get('class_name')
        self.class_start_time = map.get('class_start_time')
        self.class_status = map.get('class_status')
        self.org_did = map.get('org_did')
        self.privacy_desc_list = []
        if map.get('privacy_desc_list') is not None:
            for k in map.get('privacy_desc_list'):
                temp_model = PrivacyDesc()
                self.privacy_desc_list.append(temp_model.from_map(k))
        else:
            self.privacy_desc_list = None
        self.proxy_desc_list = []
        if map.get('proxy_desc_list') is not None:
            for k in map.get('proxy_desc_list'):
                temp_model = ProxyDesc()
                self.proxy_desc_list.append(temp_model.from_map(k))
        else:
            self.proxy_desc_list = None
        self.public_desc_list = []
        if map.get('public_desc_list') is not None:
            for k in map.get('public_desc_list'):
                temp_model = PublicDesc()
                self.public_desc_list.append(temp_model.from_map(k))
        else:
            self.public_desc_list = None
        self.secret_key = map.get('secret_key')
        return self


class UpdateBaasEbcOrganizationClassResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class AddBaasEbcClassUserRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_id=None, org_did=None,
                 org_user_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 班级id
        self.class_id = class_id
        # 企业id
        self.org_did = org_did
        # 企业用户列表,最多一次传入50个
        self.org_user_list = org_user_list

    def validate(self):
        if self.class_id:
            self.validate_max_length(self.class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                self.org_user_list.append(temp_model.from_map(k))
        else:
            self.org_user_list = None
        return self


class AddBaasEbcClassUserResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 加入失败的用户列表
        self.fail_list = fail_list

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                self.fail_list.append(temp_model.from_map(k))
        else:
            self.fail_list = None
        return self


class DeleteBaasEbcClassUserRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_id=None, org_did=None,
                 org_user_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 班级id
        self.class_id = class_id
        # 企业id
        self.org_did = org_did
        # 企业用户列表,最多一次传入50个
        self.org_user_list = org_user_list

    def validate(self):
        if self.class_id:
            self.validate_max_length(self.class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                self.org_user_list.append(temp_model.from_map(k))
        else:
            self.org_user_list = None
        return self


class DeleteBaasEbcClassUserResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 删除失败的用户列表
        self.fail_list = fail_list

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                self.fail_list.append(temp_model.from_map(k))
        else:
            self.fail_list = None
        return self


class QueryBaasEbcOrganizationClassRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_id=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 班级id
        self.class_id = class_id
        # 企业did
        self.org_did = org_did

    def validate(self):
        if self.class_id:
            self.validate_max_length(self.class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        return self


class QueryBaasEbcOrganizationClassResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, class_name=None, class_status=None,
                 create_time=None, modify_time=None, period=None, type=None, user_num=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 班级名称
        self.class_name = class_name
        # 1:有效、2:暂停、3:失效
        self.class_status = class_status
        # 创建时间
        self.create_time = create_time
        # 修改时间
        self.modify_time = modify_time
        # 累计时长
        self.period = period
        # 班级类型：线上、线下、混合
        self.type = type
        # 学员数量
        self.user_num = user_num

    def validate(self):
        if self.create_time:
            self.validate_pattern(self.create_time, 'create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.modify_time:
            self.validate_pattern(self.modify_time, 'modify_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['class_name'] = self.class_name
        result['class_status'] = self.class_status
        result['create_time'] = self.create_time
        result['modify_time'] = self.modify_time
        result['period'] = self.period
        result['type'] = self.type
        result['user_num'] = self.user_num
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.class_name = map.get('class_name')
        self.class_status = map.get('class_status')
        self.create_time = map.get('create_time')
        self.modify_time = map.get('modify_time')
        self.period = map.get('period')
        self.type = map.get('type')
        self.user_num = map.get('user_num')
        return self


class QueryBaasEbcClassUserRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_id=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 班级id
        self.class_id = class_id
        # 企业did
        self.org_did = org_did

    def validate(self):
        if self.class_id:
            self.validate_max_length(self.class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        return self


class QueryBaasEbcClassUserResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, class_name=None, org_user_id_list=None,
                 user_num=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 班级名称
        self.class_name = class_name
        # 企业用户id列表
        self.org_user_id_list = org_user_id_list
        # 学员数量
        self.user_num = user_num

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['class_name'] = self.class_name
        result['org_user_id_list'] = self.org_user_id_list
        result['user_num'] = self.user_num
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.class_name = map.get('class_name')
        self.org_user_id_list = map.get('org_user_id_list')
        self.user_num = map.get('user_num')
        return self


class CreateBaasEbcOrganizationCourseRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, course_description=None,
                 course_end_time=None, course_name=None, course_start_time=None, course_summary=None, course_type=None,
                 org_did=None, period=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 课程描述
        # 
        self.course_description = course_description
        # 课程结束时间
        self.course_end_time = course_end_time
        # 课程名称
        self.course_name = course_name
        # 课程开始时间
        self.course_start_time = course_start_time
        # 课程简介
        # 
        self.course_summary = course_summary
        # 课程类型
        # 1直播课程，2录播课程，3线下课程，4其他类型
        self.course_type = course_type
        # 企业did
        self.org_did = org_did
        # 课程时长
        self.period = period

    def validate(self):
        if self.course_description:
            self.validate_max_length(self.course_description, 'course_description', 1000)
        if self.course_end_time:
            self.validate_pattern(self.course_end_time, 'course_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.course_name:
            self.validate_max_length(self.course_name, 'course_name', 64)
        if self.course_start_time:
            self.validate_pattern(self.course_start_time, 'course_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.course_summary:
            self.validate_max_length(self.course_summary, 'course_summary', 120)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['course_description'] = self.course_description
        result['course_end_time'] = self.course_end_time
        result['course_name'] = self.course_name
        result['course_start_time'] = self.course_start_time
        result['course_summary'] = self.course_summary
        result['course_type'] = self.course_type
        result['org_did'] = self.org_did
        result['period'] = self.period
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.course_description = map.get('course_description')
        self.course_end_time = map.get('course_end_time')
        self.course_name = map.get('course_name')
        self.course_start_time = map.get('course_start_time')
        self.course_summary = map.get('course_summary')
        self.course_type = map.get('course_type')
        self.org_did = map.get('org_did')
        self.period = map.get('period')
        return self


class CreateBaasEbcOrganizationCourseResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, course_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 课程did
        self.course_id = course_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['course_id'] = self.course_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.course_id = map.get('course_id')
        return self


class UpdateBaasEbcOrganizationCourseRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, course_description=None,
                 course_end_time=None, course_id=None, course_name=None, course_start_time=None, course_summary=None,
                 course_type=None, org_did=None, period=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 课程描述
        # 
        self.course_description = course_description
        # 课程结束时间
        self.course_end_time = course_end_time
        # 课程id
        self.course_id = course_id
        # 课程名称
        self.course_name = course_name
        # 课程开始时间
        self.course_start_time = course_start_time
        # 课程简介
        # 
        self.course_summary = course_summary
        # 课程类型
        # 1直播课程，2录播课程，3线下课程，4其他类型
        self.course_type = course_type
        # 企业id
        self.org_did = org_did
        # 课程时长
        self.period = period

    def validate(self):
        if self.course_description:
            self.validate_max_length(self.course_description, 'course_description', 1000)
        if self.course_end_time:
            self.validate_pattern(self.course_end_time, 'course_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.course_id:
            self.validate_max_length(self.course_id, 'course_id', 128)
        if self.course_name:
            self.validate_max_length(self.course_name, 'course_name', 64)
        if self.course_start_time:
            self.validate_pattern(self.course_start_time, 'course_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.course_summary:
            self.validate_max_length(self.course_summary, 'course_summary', 120)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['course_description'] = self.course_description
        result['course_end_time'] = self.course_end_time
        result['course_id'] = self.course_id
        result['course_name'] = self.course_name
        result['course_start_time'] = self.course_start_time
        result['course_summary'] = self.course_summary
        result['course_type'] = self.course_type
        result['org_did'] = self.org_did
        result['period'] = self.period
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.course_description = map.get('course_description')
        self.course_end_time = map.get('course_end_time')
        self.course_id = map.get('course_id')
        self.course_name = map.get('course_name')
        self.course_start_time = map.get('course_start_time')
        self.course_summary = map.get('course_summary')
        self.course_type = map.get('course_type')
        self.org_did = map.get('org_did')
        self.period = map.get('period')
        return self


class UpdateBaasEbcOrganizationCourseResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class AddBaasEbcCourseClassRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_list=None, course_id=None,
                 org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 班级列表,最多一次传入50个
        self.class_list = class_list
        # 班级id
        self.course_id = course_id
        # 企业id
        self.org_did = org_did

    def validate(self):
        if self.class_list:
            for k in self.class_list:
                if k:
                    k.validate()
        if self.course_id:
            self.validate_max_length(self.course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_list'] = []
        if self.class_list is not None:
            for k in self.class_list:
                result['class_list'].append(k.to_map() if k else None)
        else:
            result['class_list'] = None
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_list = []
        if map.get('class_list') is not None:
            for k in map.get('class_list'):
                temp_model = Class()
                self.class_list.append(temp_model.from_map(k))
        else:
            self.class_list = None
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        return self


class AddBaasEbcCourseClassResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 添加失败的班级列表
        self.fail_list = fail_list

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = Class()
                self.fail_list.append(temp_model.from_map(k))
        else:
            self.fail_list = None
        return self


class AddBaasEbcCourseUserRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, course_id=None, org_did=None,
                 org_user_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 课程id
        self.course_id = course_id
        # 企业id
        self.org_did = org_did
        # 企业用户列表,最多一次传入50个
        self.org_user_list = org_user_list

    def validate(self):
        if self.course_id:
            self.validate_max_length(self.course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                self.org_user_list.append(temp_model.from_map(k))
        else:
            self.org_user_list = None
        return self


class AddBaasEbcCourseUserResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 添加失败的用户列表
        self.fail_list = fail_list

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                self.fail_list.append(temp_model.from_map(k))
        else:
            self.fail_list = None
        return self


class DeleteBaasEbcCourseClassRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, class_list=None, course_id=None,
                 org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 班级列表,最多一次传入50个
        self.class_list = class_list
        # 课程id
        self.course_id = course_id
        # 企业id
        self.org_did = org_did

    def validate(self):
        if self.class_list:
            for k in self.class_list:
                if k:
                    k.validate()
        if self.course_id:
            self.validate_max_length(self.course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['class_list'] = []
        if self.class_list is not None:
            for k in self.class_list:
                result['class_list'].append(k.to_map() if k else None)
        else:
            result['class_list'] = None
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.class_list = []
        if map.get('class_list') is not None:
            for k in map.get('class_list'):
                temp_model = Class()
                self.class_list.append(temp_model.from_map(k))
        else:
            self.class_list = None
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        return self


class DeleteBaasEbcCourseClassResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 删除失败的班级列表
        self.fail_list = fail_list

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = Class()
                self.fail_list.append(temp_model.from_map(k))
        else:
            self.fail_list = None
        return self


class DeleteBaasEbcCourseUserRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, course_id=None, org_did=None,
                 org_user_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 课程id
        self.course_id = course_id
        # 企业id
        self.org_did = org_did
        # 企业用户列表,最多一次传入50个
        self.org_user_list = org_user_list

    def validate(self):
        if self.course_id:
            self.validate_max_length(self.course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                self.org_user_list.append(temp_model.from_map(k))
        else:
            self.org_user_list = None
        return self


class DeleteBaasEbcCourseUserResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 删除失败的用户列表
        self.fail_list = fail_list

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                self.fail_list.append(temp_model.from_map(k))
        else:
            self.fail_list = None
        return self


class CreateBaasEbcUserCertRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_code=None,
                 cert_description=None, cert_end_time=None, cert_name_cn=None, cert_name_en=None, cert_publish_time=None,
                 cert_publish_time_zone=None, cert_start_time=None, cert_status=None, cert_summary=None, country=None, expire_type=None,
                 holder_name=None, level=None, org_did=None, org_name=None, org_user_id=None, primary_id_no=None,
                 privacy_desc_list=None, proxy_desc_list=None, public_desc_list=None, second_id_no_1=None, second_id_no_2=None,
                 second_id_no_3=None, secret_key=None, type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 证书编号
        self.cert_code = cert_code
        # 证书描述
        self.cert_description = cert_description
        # 时间周期结束时间
        self.cert_end_time = cert_end_time
        # 证书名称-中文
        self.cert_name_cn = cert_name_cn
        # 证书名称-英文（拼音）
        self.cert_name_en = cert_name_en
        # 首次发布时间
        self.cert_publish_time = cert_publish_time
        # 发布时间时区，默认UTC+8
        self.cert_publish_time_zone = cert_publish_time_zone
        # 时间周期开始时间
        self.cert_start_time = cert_start_time
        # 1-有效 2-冻结 3-失效 4-作废 5-其他
        self.cert_status = cert_status
        # 证书概述
        self.cert_summary = cert_summary
        # 证书归属国家 使用“ISO 3166-1”代码表-数字码 https://zh.wikipedia.org/wiki/ISO_3166-1
        self.country = country
        # 有效期类型1.长期有效 2.时间周期
        self.expire_type = expire_type
        # 证书持有人姓名
        # 
        self.holder_name = holder_name
        # 证书等级类型： 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
        self.level = level
        # 企业id
        self.org_did = org_did
        # 企业名称
        self.org_name = org_name
        # 企业用户id
        self.org_user_id = org_user_id
        # 持有人主证件编号，无身份证的个人使用0000000000000000
        # 请使用我们提供的公钥对数据进行加密
        # 
        self.primary_id_no = primary_id_no
        # 隐私属性描述列表
        self.privacy_desc_list = privacy_desc_list
        # 托管属性描述列表
        self.proxy_desc_list = proxy_desc_list
        # 公开属性描述列表
        self.public_desc_list = public_desc_list
        # 持有人辅助证件编号-1
        # 请使用我们提供的公钥对数据进行加密
        self.second_id_no_1 = second_id_no_1
        # 持有人辅助证件编号-2
        # 请使用我们提供的公钥对数据进行加密
        self.second_id_no_2 = second_id_no_2
        # 持有人辅助证件编号-3
        # 请使用我们提供的公钥对数据进行加密
        self.second_id_no_3 = second_id_no_3
        # 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
        self.secret_key = secret_key
        # -数字码类型为156时可使用如下类目： --学历证书-XLZ --职业证书--ZYZ -其他国家传入--QT
        self.type = type

    def validate(self):
        if self.cert_code:
            self.validate_max_length(self.cert_code, 'cert_code', 64)
        if self.cert_description:
            self.validate_max_length(self.cert_description, 'cert_description', 1000)
        if self.cert_end_time:
            self.validate_pattern(self.cert_end_time, 'cert_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.cert_name_cn:
            self.validate_max_length(self.cert_name_cn, 'cert_name_cn', 64)
        if self.cert_name_en:
            self.validate_max_length(self.cert_name_en, 'cert_name_en', 64)
        if self.cert_publish_time:
            self.validate_pattern(self.cert_publish_time, 'cert_publish_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.cert_publish_time_zone:
            self.validate_max_length(self.cert_publish_time_zone, 'cert_publish_time_zone', 64)
        if self.cert_start_time:
            self.validate_pattern(self.cert_start_time, 'cert_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.cert_summary:
            self.validate_max_length(self.cert_summary, 'cert_summary', 250)
        if self.country:
            self.validate_max_length(self.country, 'country', 32)
        if self.holder_name:
            self.validate_max_length(self.holder_name, 'holder_name', 64)
        if self.level:
            self.validate_max_length(self.level, 'level', 256)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.org_name:
            self.validate_max_length(self.org_name, 'org_name', 64)
        if self.org_user_id:
            self.validate_max_length(self.org_user_id, 'org_user_id', 128)
        if self.primary_id_no:
            self.validate_max_length(self.primary_id_no, 'primary_id_no', 1024)
        if self.privacy_desc_list:
            for k in self.privacy_desc_list:
                if k:
                    k.validate()
        if self.proxy_desc_list:
            for k in self.proxy_desc_list:
                if k:
                    k.validate()
        if self.public_desc_list:
            for k in self.public_desc_list:
                if k:
                    k.validate()
        if self.second_id_no_1:
            self.validate_max_length(self.second_id_no_1, 'second_id_no_1', 1024)
        if self.second_id_no_2:
            self.validate_max_length(self.second_id_no_2, 'second_id_no_2', 1024)
        if self.second_id_no_3:
            self.validate_max_length(self.second_id_no_3, 'second_id_no_3', 1024)
        if self.secret_key:
            self.validate_max_length(self.secret_key, 'secret_key', 512)
        if self.type:
            self.validate_max_length(self.type, 'type', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_code'] = self.cert_code
        result['cert_description'] = self.cert_description
        result['cert_end_time'] = self.cert_end_time
        result['cert_name_cn'] = self.cert_name_cn
        result['cert_name_en'] = self.cert_name_en
        result['cert_publish_time'] = self.cert_publish_time
        result['cert_publish_time_zone'] = self.cert_publish_time_zone
        result['cert_start_time'] = self.cert_start_time
        result['cert_status'] = self.cert_status
        result['cert_summary'] = self.cert_summary
        result['country'] = self.country
        result['expire_type'] = self.expire_type
        result['holder_name'] = self.holder_name
        result['level'] = self.level
        result['org_did'] = self.org_did
        result['org_name'] = self.org_name
        result['org_user_id'] = self.org_user_id
        result['primary_id_no'] = self.primary_id_no
        result['privacy_desc_list'] = []
        if self.privacy_desc_list is not None:
            for k in self.privacy_desc_list:
                result['privacy_desc_list'].append(k.to_map() if k else None)
        else:
            result['privacy_desc_list'] = None
        result['proxy_desc_list'] = []
        if self.proxy_desc_list is not None:
            for k in self.proxy_desc_list:
                result['proxy_desc_list'].append(k.to_map() if k else None)
        else:
            result['proxy_desc_list'] = None
        result['public_desc_list'] = []
        if self.public_desc_list is not None:
            for k in self.public_desc_list:
                result['public_desc_list'].append(k.to_map() if k else None)
        else:
            result['public_desc_list'] = None
        result['second_id_no_1'] = self.second_id_no_1
        result['second_id_no_2'] = self.second_id_no_2
        result['second_id_no_3'] = self.second_id_no_3
        result['secret_key'] = self.secret_key
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_code = map.get('cert_code')
        self.cert_description = map.get('cert_description')
        self.cert_end_time = map.get('cert_end_time')
        self.cert_name_cn = map.get('cert_name_cn')
        self.cert_name_en = map.get('cert_name_en')
        self.cert_publish_time = map.get('cert_publish_time')
        self.cert_publish_time_zone = map.get('cert_publish_time_zone')
        self.cert_start_time = map.get('cert_start_time')
        self.cert_status = map.get('cert_status')
        self.cert_summary = map.get('cert_summary')
        self.country = map.get('country')
        self.expire_type = map.get('expire_type')
        self.holder_name = map.get('holder_name')
        self.level = map.get('level')
        self.org_did = map.get('org_did')
        self.org_name = map.get('org_name')
        self.org_user_id = map.get('org_user_id')
        self.primary_id_no = map.get('primary_id_no')
        self.privacy_desc_list = []
        if map.get('privacy_desc_list') is not None:
            for k in map.get('privacy_desc_list'):
                temp_model = PrivacyDesc()
                self.privacy_desc_list.append(temp_model.from_map(k))
        else:
            self.privacy_desc_list = None
        self.proxy_desc_list = []
        if map.get('proxy_desc_list') is not None:
            for k in map.get('proxy_desc_list'):
                temp_model = ProxyDesc()
                self.proxy_desc_list.append(temp_model.from_map(k))
        else:
            self.proxy_desc_list = None
        self.public_desc_list = []
        if map.get('public_desc_list') is not None:
            for k in map.get('public_desc_list'):
                temp_model = PublicDesc()
                self.public_desc_list.append(temp_model.from_map(k))
        else:
            self.public_desc_list = None
        self.second_id_no_1 = map.get('second_id_no_1')
        self.second_id_no_2 = map.get('second_id_no_2')
        self.second_id_no_3 = map.get('second_id_no_3')
        self.secret_key = map.get('secret_key')
        self.type = map.get('type')
        return self


class CreateBaasEbcUserCertResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, cert_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 证书id
        self.cert_id = cert_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['cert_id'] = self.cert_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.cert_id = map.get('cert_id')
        return self


class UpdateBaasEbcUserCertRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_id=None,
                 cert_publish_time=None, cert_status=None, org_did=None, org_user_id=None, privacy_desc_list=None,
                 proxy_desc_list=None, public_desc_list=None, secret_key=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 证书id
        self.cert_id = cert_id
        # 首次发布时间
        self.cert_publish_time = cert_publish_time
        # 1-有效 2-冻结 3-失效 4-作废 5-其他
        self.cert_status = cert_status
        # 企业did
        self.org_did = org_did
        # 企业用户id
        self.org_user_id = org_user_id
        # 隐私属性描述列表
        # 
        self.privacy_desc_list = privacy_desc_list
        # 托管属性描述列表
        # 
        self.proxy_desc_list = proxy_desc_list
        # 公开属性描述列表
        # 
        self.public_desc_list = public_desc_list
        # 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
        self.secret_key = secret_key

    def validate(self):
        if self.cert_id:
            self.validate_max_length(self.cert_id, 'cert_id', 128)
        if self.cert_publish_time:
            self.validate_pattern(self.cert_publish_time, 'cert_publish_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.org_user_id:
            self.validate_max_length(self.org_user_id, 'org_user_id', 128)
        if self.privacy_desc_list:
            for k in self.privacy_desc_list:
                if k:
                    k.validate()
        if self.proxy_desc_list:
            for k in self.proxy_desc_list:
                if k:
                    k.validate()
        if self.public_desc_list:
            for k in self.public_desc_list:
                if k:
                    k.validate()
        if self.secret_key:
            self.validate_max_length(self.secret_key, 'secret_key', 512)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_id'] = self.cert_id
        result['cert_publish_time'] = self.cert_publish_time
        result['cert_status'] = self.cert_status
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        result['privacy_desc_list'] = []
        if self.privacy_desc_list is not None:
            for k in self.privacy_desc_list:
                result['privacy_desc_list'].append(k.to_map() if k else None)
        else:
            result['privacy_desc_list'] = None
        result['proxy_desc_list'] = []
        if self.proxy_desc_list is not None:
            for k in self.proxy_desc_list:
                result['proxy_desc_list'].append(k.to_map() if k else None)
        else:
            result['proxy_desc_list'] = None
        result['public_desc_list'] = []
        if self.public_desc_list is not None:
            for k in self.public_desc_list:
                result['public_desc_list'].append(k.to_map() if k else None)
        else:
            result['public_desc_list'] = None
        result['secret_key'] = self.secret_key
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_id = map.get('cert_id')
        self.cert_publish_time = map.get('cert_publish_time')
        self.cert_status = map.get('cert_status')
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        self.privacy_desc_list = []
        if map.get('privacy_desc_list') is not None:
            for k in map.get('privacy_desc_list'):
                temp_model = PrivacyDesc()
                self.privacy_desc_list.append(temp_model.from_map(k))
        else:
            self.privacy_desc_list = None
        self.proxy_desc_list = []
        if map.get('proxy_desc_list') is not None:
            for k in map.get('proxy_desc_list'):
                temp_model = ProxyDesc()
                self.proxy_desc_list.append(temp_model.from_map(k))
        else:
            self.proxy_desc_list = None
        self.public_desc_list = []
        if map.get('public_desc_list') is not None:
            for k in map.get('public_desc_list'):
                temp_model = PublicDesc()
                self.public_desc_list.append(temp_model.from_map(k))
        else:
            self.public_desc_list = None
        self.secret_key = map.get('secret_key')
        return self


class UpdateBaasEbcUserCertResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class QueryBaasEbcOrganizationCertRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, end=None, org_did=None,
                 start=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 查询结束时间
        self.end = end
        # 企业id
        self.org_did = org_did
        # 开始时间
        self.start = start

    def validate(self):
        if self.end:
            self.validate_pattern(self.end, 'end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.start:
            self.validate_pattern(self.start, 'start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['end'] = self.end
        result['org_did'] = self.org_did
        result['start'] = self.start
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.end = map.get('end')
        self.org_did = map.get('org_did')
        self.start = map.get('start')
        return self


class QueryBaasEbcOrganizationCertResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, cert_id_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 证书id
        self.cert_id_list = cert_id_list

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['cert_id_list'] = self.cert_id_list
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.cert_id_list = map.get('cert_id_list')
        return self


class QueryBaasEbcUserCertRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, org_did=None, org_user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 企业did
        self.org_did = org_did
        # 企业用户id
        self.org_user_id = org_user_id

    def validate(self):
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.org_user_id:
            self.validate_max_length(self.org_user_id, 'org_user_id', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        return self


class QueryBaasEbcUserCertResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, cert_id_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 证书id列表
        self.cert_id_list = cert_id_list

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['cert_id_list'] = self.cert_id_list
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.cert_id_list = map.get('cert_id_list')
        return self


class QueryBaasEbcCertRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_id=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 证书id
        self.cert_id = cert_id
        # 企业did
        self.org_did = org_did

    def validate(self):
        if self.cert_id:
            self.validate_max_length(self.cert_id, 'cert_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_id'] = self.cert_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_id = map.get('cert_id')
        self.org_did = map.get('org_did')
        return self


class QueryBaasEbcCertResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, cert=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 证书明细
        self.cert = cert  # type: Cert

    def validate(self):
        if self.cert:
            self.cert.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.cert is not None:
            result['cert'] = self.cert.to_map()
        else:
            result['cert'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('cert') is not None:
            temp_model = Cert()
            self.cert = temp_model.from_map(map['cert'])
        else:
            self.cert = None
        return self


class ApplyBaasEbcCertUrlRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_code=None, org_did=None,
                 org_user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 证书code
        self.cert_code = cert_code
        # 机构did
        self.org_did = org_did
        # 证书持有人id
        self.org_user_id = org_user_id

    def validate(self):
        if self.cert_code:
            self.validate_max_length(self.cert_code, 'cert_code', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_code'] = self.cert_code
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_code = map.get('cert_code')
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        return self


class ApplyBaasEbcCertUrlResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, cert_upload_url=None,
                 feature_upload_url=None, holder_avatar_upload_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 实体证书图片上传url，文件最大5M
        self.cert_upload_url = cert_upload_url
        # 其他信息文件上传url，文件最大5M
        # 
        self.feature_upload_url = feature_upload_url
        # 持有人的人脸图像上传url，文件最大5M
        self.holder_avatar_upload_url = holder_avatar_upload_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['cert_upload_url'] = self.cert_upload_url
        result['feature_upload_url'] = self.feature_upload_url
        result['holder_avatar_upload_url'] = self.holder_avatar_upload_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.cert_upload_url = map.get('cert_upload_url')
        self.feature_upload_url = map.get('feature_upload_url')
        self.holder_avatar_upload_url = map.get('holder_avatar_upload_url')
        return self


class CreateBaasEbcAuthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auth_end_time=None,
                 auth_start_time=None, data_type=None, target_id_list=None, target_type=None, tenant_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 授权关系结束时间
        self.auth_end_time = auth_end_time
        # 授权关系开始时间
        self.auth_start_time = auth_start_time
        # 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
        self.data_type = data_type
        # 授权目标数据id列表，最多20个
        self.target_id_list = target_id_list
        # 1.数据,2.机构,3.认证方,4.ALL
        self.target_type = target_type
        # 消费方租户id
        self.tenant_name = tenant_name

    def validate(self):
        if self.auth_end_time:
            self.validate_pattern(self.auth_end_time, 'auth_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.auth_start_time:
            self.validate_pattern(self.auth_start_time, 'auth_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.tenant_name:
            self.validate_max_length(self.tenant_name, 'tenant_name', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auth_end_time'] = self.auth_end_time
        result['auth_start_time'] = self.auth_start_time
        result['data_type'] = self.data_type
        result['target_id_list'] = self.target_id_list
        result['target_type'] = self.target_type
        result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auth_end_time = map.get('auth_end_time')
        self.auth_start_time = map.get('auth_start_time')
        self.data_type = map.get('data_type')
        self.target_id_list = map.get('target_id_list')
        self.target_type = map.get('target_type')
        self.tenant_name = map.get('tenant_name')
        return self


class CreateBaasEbcAuthResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, auth_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 授权关系id
        self.auth_id = auth_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['auth_id'] = self.auth_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.auth_id = map.get('auth_id')
        return self


class UpdateBaasEbcAuthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auth_end_time=None,
                 auth_id=None, auth_start_time=None, data_type=None, target_id_list=None, target_type=None,
                 tenant_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 授权关系结束时间
        # 
        self.auth_end_time = auth_end_time
        # 授权关系id
        self.auth_id = auth_id
        # 授权关系开始时间
        # 
        self.auth_start_time = auth_start_time
        # 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
        self.data_type = data_type
        # 授权目标数据id列表，最多20个
        self.target_id_list = target_id_list
        # 1.数据,2.机构,3.认证方,4.ALL
        # 
        self.target_type = target_type
        # 消费方租户id
        # 
        self.tenant_name = tenant_name

    def validate(self):
        if self.auth_end_time:
            self.validate_pattern(self.auth_end_time, 'auth_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.auth_id:
            self.validate_max_length(self.auth_id, 'auth_id', 256)
        if self.auth_start_time:
            self.validate_pattern(self.auth_start_time, 'auth_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.tenant_name:
            self.validate_max_length(self.tenant_name, 'tenant_name', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auth_end_time'] = self.auth_end_time
        result['auth_id'] = self.auth_id
        result['auth_start_time'] = self.auth_start_time
        result['data_type'] = self.data_type
        result['target_id_list'] = self.target_id_list
        result['target_type'] = self.target_type
        result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auth_end_time = map.get('auth_end_time')
        self.auth_id = map.get('auth_id')
        self.auth_start_time = map.get('auth_start_time')
        self.data_type = map.get('data_type')
        self.target_id_list = map.get('target_id_list')
        self.target_type = map.get('target_type')
        self.tenant_name = map.get('tenant_name')
        return self


class UpdateBaasEbcAuthResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class UpdateBaasEbcAuthStatusRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auth_id=None, status=None,
                 tenant_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 授权关系id
        # 
        self.auth_id = auth_id
        # 1:启用，2：禁用，3：停用
        self.status = status
        # 消费方租户id
        # 
        self.tenant_name = tenant_name

    def validate(self):
        if self.auth_id:
            self.validate_max_length(self.auth_id, 'auth_id', 256)
        if self.tenant_name:
            self.validate_max_length(self.tenant_name, 'tenant_name', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auth_id'] = self.auth_id
        result['status'] = self.status
        result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auth_id = map.get('auth_id')
        self.status = map.get('status')
        self.tenant_name = map.get('tenant_name')
        return self


class UpdateBaasEbcAuthStatusResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class UpdateBaasEbcDataPriceRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, data_id_list=None,
                 data_type=None, price=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 目标数据id列表，最多20个
        self.data_id_list = data_id_list
        # 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
        self.data_type = data_type
        # 数据价值
        self.price = price

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['data_id_list'] = self.data_id_list
        result['data_type'] = self.data_type
        result['price'] = self.price
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.data_id_list = map.get('data_id_list')
        self.data_type = map.get('data_type')
        self.price = map.get('price')
        return self


class UpdateBaasEbcDataPriceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 更新失败的id列表
        self.fail_list = fail_list

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_list'] = self.fail_list
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_list = map.get('fail_list')
        return self


class QueryBaasEbcConsumptionAmountRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, end_time=None, start_time=None,
                 tenant_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 结束时间
        self.end_time = end_time
        # 开始时间
        self.start_time = start_time
        # 消费方租户id
        self.tenant_name = tenant_name

    def validate(self):
        if self.end_time:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.start_time:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.tenant_name:
            self.validate_max_length(self.tenant_name, 'tenant_name', 64)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['end_time'] = self.end_time
        result['start_time'] = self.start_time
        result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.end_time = map.get('end_time')
        self.start_time = map.get('start_time')
        self.tenant_name = map.get('tenant_name')
        return self


class QueryBaasEbcConsumptionAmountResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, amount=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 区间内的累计消费金额
        self.amount = amount

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['amount'] = self.amount
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.amount = map.get('amount')
        return self


class QueryBaasEbcOrganizationCourseRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, course_id=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 班级id
        self.course_id = course_id
        # 企业did
        self.org_did = org_did

    def validate(self):
        if self.course_id:
            self.validate_max_length(self.course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 256)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        return self


class QueryBaasEbcOrganizationCourseResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, course_class_id_list=None,
                 course_description=None, course_end_time=None, course_name=None, course_org_user_id_list=None,
                 course_start_time=None, course_status=None, course_summary=None, period=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 课程班级列表
        self.course_class_id_list = course_class_id_list
        # 课程描述
        self.course_description = course_description
        # 课程结束时间
        # 
        self.course_end_time = course_end_time
        # 课程名称
        self.course_name = course_name
        # 课程学员列表
        self.course_org_user_id_list = course_org_user_id_list
        # 课程开始时间
        # 
        self.course_start_time = course_start_time
        # 1:已发布,2:进行中,3:已结束
        self.course_status = course_status
        # 课程简介
        self.course_summary = course_summary
        # 课程时长
        # 
        self.period = period

    def validate(self):
        if self.course_end_time:
            self.validate_pattern(self.course_end_time, 'course_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.course_start_time:
            self.validate_pattern(self.course_start_time, 'course_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['course_class_id_list'] = self.course_class_id_list
        result['course_description'] = self.course_description
        result['course_end_time'] = self.course_end_time
        result['course_name'] = self.course_name
        result['course_org_user_id_list'] = self.course_org_user_id_list
        result['course_start_time'] = self.course_start_time
        result['course_status'] = self.course_status
        result['course_summary'] = self.course_summary
        result['period'] = self.period
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.course_class_id_list = map.get('course_class_id_list')
        self.course_description = map.get('course_description')
        self.course_end_time = map.get('course_end_time')
        self.course_name = map.get('course_name')
        self.course_org_user_id_list = map.get('course_org_user_id_list')
        self.course_start_time = map.get('course_start_time')
        self.course_status = map.get('course_status')
        self.course_summary = map.get('course_summary')
        self.period = map.get('period')
        return self


class CreateBaasEbcCourseChapterRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chapter_biz_id=None,
                 chapter_description=None, chapter_name=None, chapter_period=None, course_id=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 业务系统章节ID
        self.chapter_biz_id = chapter_biz_id
        # 章节描述
        self.chapter_description = chapter_description
        # 章节名称
        self.chapter_name = chapter_name
        # 章节时长，单位秒
        self.chapter_period = chapter_period
        # 课程id
        self.course_id = course_id
        # 企业链上did
        self.org_did = org_did

    def validate(self):
        if self.chapter_biz_id:
            self.validate_max_length(self.chapter_biz_id, 'chapter_biz_id', 128)
        if self.chapter_description:
            self.validate_max_length(self.chapter_description, 'chapter_description', 2000)
        if self.chapter_name:
            self.validate_max_length(self.chapter_name, 'chapter_name', 128)
        if self.course_id:
            self.validate_max_length(self.course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chapter_biz_id'] = self.chapter_biz_id
        result['chapter_description'] = self.chapter_description
        result['chapter_name'] = self.chapter_name
        result['chapter_period'] = self.chapter_period
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chapter_biz_id = map.get('chapter_biz_id')
        self.chapter_description = map.get('chapter_description')
        self.chapter_name = map.get('chapter_name')
        self.chapter_period = map.get('chapter_period')
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        return self


class CreateBaasEbcCourseChapterResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, chapter_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 链上章节id
        self.chapter_id = chapter_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['chapter_id'] = self.chapter_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.chapter_id = map.get('chapter_id')
        return self


class UpdateBaasEbcCourseChapterRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chapter_description=None,
                 chapter_id=None, chapter_name=None, chapter_period=None, course_id=None, org_did=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 章节描述
        self.chapter_description = chapter_description
        # 链上章节id
        self.chapter_id = chapter_id
        # 章节名称
        self.chapter_name = chapter_name
        # 章节时长，单位秒
        self.chapter_period = chapter_period
        # 链上课程id
        self.course_id = course_id
        # 企业链上did
        self.org_did = org_did

    def validate(self):
        if self.chapter_description:
            self.validate_max_length(self.chapter_description, 'chapter_description', 2000)
        if self.chapter_id:
            self.validate_max_length(self.chapter_id, 'chapter_id', 128)
        if self.chapter_name:
            self.validate_max_length(self.chapter_name, 'chapter_name', 128)
        if self.course_id:
            self.validate_max_length(self.course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chapter_description'] = self.chapter_description
        result['chapter_id'] = self.chapter_id
        result['chapter_name'] = self.chapter_name
        result['chapter_period'] = self.chapter_period
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chapter_description = map.get('chapter_description')
        self.chapter_id = map.get('chapter_id')
        self.chapter_name = map.get('chapter_name')
        self.chapter_period = map.get('chapter_period')
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        return self


class UpdateBaasEbcCourseChapterResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class CreateBaasEbcCourseRecordRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chapter_id=None, class_id=None,
                 course_id=None, course_name=None, org_did=None, org_user_id=None, record_ext=None, record_open_time=None,
                 record_period=None, record_source=None, record_start_time=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 链上章节id
        self.chapter_id = chapter_id
        # 链上班级id
        self.class_id = class_id
        # 链上课程id
        self.course_id = course_id
        # 课程名称
        self.course_name = course_name
        # 企业did
        # 
        self.org_did = org_did
        # 企业用户id
        self.org_user_id = org_user_id
        # 课程扩展信息，格式为json。比如钉钉用户id。
        self.record_ext = record_ext
        # 本次开启时间
        self.record_open_time = record_open_time
        # 本次观看时长，单位秒
        self.record_period = record_period
        # 行为来源
        self.record_source = record_source
        # 本次点击观看时间
        self.record_start_time = record_start_time

    def validate(self):
        if self.chapter_id:
            self.validate_max_length(self.chapter_id, 'chapter_id', 128)
        if self.class_id:
            self.validate_max_length(self.class_id, 'class_id', 128)
        if self.course_id:
            self.validate_max_length(self.course_id, 'course_id', 128)
        if self.course_name:
            self.validate_max_length(self.course_name, 'course_name', 128)
        if self.org_did:
            self.validate_max_length(self.org_did, 'org_did', 128)
        if self.org_user_id:
            self.validate_max_length(self.org_user_id, 'org_user_id', 128)
        if self.record_ext:
            self.validate_max_length(self.record_ext, 'record_ext', 2000)
        if self.record_open_time:
            self.validate_pattern(self.record_open_time, 'record_open_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.record_source:
            self.validate_max_length(self.record_source, 'record_source', 128)
        if self.record_start_time:
            self.validate_pattern(self.record_start_time, 'record_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chapter_id'] = self.chapter_id
        result['class_id'] = self.class_id
        result['course_id'] = self.course_id
        result['course_name'] = self.course_name
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        result['record_ext'] = self.record_ext
        result['record_open_time'] = self.record_open_time
        result['record_period'] = self.record_period
        result['record_source'] = self.record_source
        result['record_start_time'] = self.record_start_time
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chapter_id = map.get('chapter_id')
        self.class_id = map.get('class_id')
        self.course_id = map.get('course_id')
        self.course_name = map.get('course_name')
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        self.record_ext = map.get('record_ext')
        self.record_open_time = map.get('record_open_time')
        self.record_period = map.get('record_period')
        self.record_source = map.get('record_source')
        self.record_start_time = map.get('record_start_time')
        return self


class CreateBaasEbcCourseRecordResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, record_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 链上学习记录id
        self.record_id = record_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['record_id'] = self.record_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.record_id = map.get('record_id')
        return self
