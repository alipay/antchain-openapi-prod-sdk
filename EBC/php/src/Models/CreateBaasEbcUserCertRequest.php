<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasEbcUserCertRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 证书编号
    /**
     * @var string
     */
    public $certCode;

    // 证书描述
    /**
     * @var string
     */
    public $certDescription;

    // 时间周期结束时间
    /**
     * @var string
     */
    public $certEndTime;

    // 证书名称-中文
    /**
     * @var string
     */
    public $certNameCn;

    // 证书名称-英文（拼音）
    /**
     * @var string
     */
    public $certNameEn;

    // 首次发布时间
    /**
     * @var string
     */
    public $certPublishTime;

    // 发布时间时区，默认UTC+8
    /**
     * @var string
     */
    public $certPublishTimeZone;

    // 时间周期开始时间
    /**
     * @var string
     */
    public $certStartTime;

    // 1-有效 2-冻结 3-失效 4-作废 5-其他
    /**
     * @var int
     */
    public $certStatus;

    // 证书概述
    /**
     * @var string
     */
    public $certSummary;

    // 证书归属国家 使用“ISO 3166-1”代码表-数字码 https://zh.wikipedia.org/wiki/ISO_3166-1
    /**
     * @var string
     */
    public $country;

    // 有效期类型1.长期有效 2.时间周期
    /**
     * @var int
     */
    public $expireType;

    // 证书持有人姓名
    //
    /**
     * @var string
     */
    public $holderName;

    // 证书等级类型： 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
    /**
     * @var string
     */
    public $level;

    // 企业id
    /**
     * @var string
     */
    public $orgDid;

    // 企业名称
    /**
     * @var string
     */
    public $orgName;

    // 企业用户id
    /**
     * @var string
     */
    public $orgUserId;

    // 持有人主证件编号，无身份证的个人使用0000000000000000
    // 请使用我们提供的公钥对数据进行加密
    //
    /**
     * @var string
     */
    public $primaryIdNo;

    // 隐私属性描述列表
    /**
     * @var PrivacyDesc[]
     */
    public $privacyDescList;

    // 托管属性描述列表
    /**
     * @var ProxyDesc[]
     */
    public $proxyDescList;

    // 公开属性描述列表
    /**
     * @var PublicDesc[]
     */
    public $publicDescList;

    // 持有人辅助证件编号-1
    // 请使用我们提供的公钥对数据进行加密
    /**
     * @var string
     */
    public $secondIdNo1;

    // 持有人辅助证件编号-2
    // 请使用我们提供的公钥对数据进行加密
    /**
     * @var string
     */
    public $secondIdNo2;

    // 持有人辅助证件编号-3
    // 请使用我们提供的公钥对数据进行加密
    /**
     * @var string
     */
    public $secondIdNo3;

    // 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
    /**
     * @var string
     */
    public $secretKey;

    // -数字码类型为156时可使用如下类目： --学历证书-XLZ --职业证书--ZYZ -其他国家传入--QT
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'regionName'          => 'region_name',
        'certCode'            => 'cert_code',
        'certDescription'     => 'cert_description',
        'certEndTime'         => 'cert_end_time',
        'certNameCn'          => 'cert_name_cn',
        'certNameEn'          => 'cert_name_en',
        'certPublishTime'     => 'cert_publish_time',
        'certPublishTimeZone' => 'cert_publish_time_zone',
        'certStartTime'       => 'cert_start_time',
        'certStatus'          => 'cert_status',
        'certSummary'         => 'cert_summary',
        'country'             => 'country',
        'expireType'          => 'expire_type',
        'holderName'          => 'holder_name',
        'level'               => 'level',
        'orgDid'              => 'org_did',
        'orgName'             => 'org_name',
        'orgUserId'           => 'org_user_id',
        'primaryIdNo'         => 'primary_id_no',
        'privacyDescList'     => 'privacy_desc_list',
        'proxyDescList'       => 'proxy_desc_list',
        'publicDescList'      => 'public_desc_list',
        'secondIdNo1'         => 'second_id_no_1',
        'secondIdNo2'         => 'second_id_no_2',
        'secondIdNo3'         => 'second_id_no_3',
        'secretKey'           => 'secret_key',
        'type'                => 'type',
    ];

    public function validate()
    {
        Model::validateMaxLength('certCode', $this->certCode, 64);
        Model::validateMaxLength('certDescription', $this->certDescription, 1000);
        Model::validateMaxLength('certNameCn', $this->certNameCn, 64);
        Model::validateMaxLength('certNameEn', $this->certNameEn, 64);
        Model::validateMaxLength('certPublishTimeZone', $this->certPublishTimeZone, 64);
        Model::validateMaxLength('certSummary', $this->certSummary, 250);
        Model::validateMaxLength('country', $this->country, 32);
        Model::validateMaxLength('holderName', $this->holderName, 64);
        Model::validateMaxLength('level', $this->level, 256);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validateMaxLength('orgName', $this->orgName, 64);
        Model::validateMaxLength('orgUserId', $this->orgUserId, 128);
        Model::validateMaxLength('primaryIdNo', $this->primaryIdNo, 1024);
        Model::validateMaxLength('secondIdNo1', $this->secondIdNo1, 1024);
        Model::validateMaxLength('secondIdNo2', $this->secondIdNo2, 1024);
        Model::validateMaxLength('secondIdNo3', $this->secondIdNo3, 1024);
        Model::validateMaxLength('secretKey', $this->secretKey, 512);
        Model::validateMaxLength('type', $this->type, 64);
        Model::validatePattern('certEndTime', $this->certEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('certPublishTime', $this->certPublishTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('certStartTime', $this->certStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->certCode) {
            $res['cert_code'] = $this->certCode;
        }
        if (null !== $this->certDescription) {
            $res['cert_description'] = $this->certDescription;
        }
        if (null !== $this->certEndTime) {
            $res['cert_end_time'] = $this->certEndTime;
        }
        if (null !== $this->certNameCn) {
            $res['cert_name_cn'] = $this->certNameCn;
        }
        if (null !== $this->certNameEn) {
            $res['cert_name_en'] = $this->certNameEn;
        }
        if (null !== $this->certPublishTime) {
            $res['cert_publish_time'] = $this->certPublishTime;
        }
        if (null !== $this->certPublishTimeZone) {
            $res['cert_publish_time_zone'] = $this->certPublishTimeZone;
        }
        if (null !== $this->certStartTime) {
            $res['cert_start_time'] = $this->certStartTime;
        }
        if (null !== $this->certStatus) {
            $res['cert_status'] = $this->certStatus;
        }
        if (null !== $this->certSummary) {
            $res['cert_summary'] = $this->certSummary;
        }
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }
        if (null !== $this->expireType) {
            $res['expire_type'] = $this->expireType;
        }
        if (null !== $this->holderName) {
            $res['holder_name'] = $this->holderName;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        if (null !== $this->orgUserId) {
            $res['org_user_id'] = $this->orgUserId;
        }
        if (null !== $this->primaryIdNo) {
            $res['primary_id_no'] = $this->primaryIdNo;
        }
        if (null !== $this->privacyDescList) {
            $res['privacy_desc_list'] = [];
            if (null !== $this->privacyDescList && \is_array($this->privacyDescList)) {
                $n = 0;
                foreach ($this->privacyDescList as $item) {
                    $res['privacy_desc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->proxyDescList) {
            $res['proxy_desc_list'] = [];
            if (null !== $this->proxyDescList && \is_array($this->proxyDescList)) {
                $n = 0;
                foreach ($this->proxyDescList as $item) {
                    $res['proxy_desc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->publicDescList) {
            $res['public_desc_list'] = [];
            if (null !== $this->publicDescList && \is_array($this->publicDescList)) {
                $n = 0;
                foreach ($this->publicDescList as $item) {
                    $res['public_desc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->secondIdNo1) {
            $res['second_id_no_1'] = $this->secondIdNo1;
        }
        if (null !== $this->secondIdNo2) {
            $res['second_id_no_2'] = $this->secondIdNo2;
        }
        if (null !== $this->secondIdNo3) {
            $res['second_id_no_3'] = $this->secondIdNo3;
        }
        if (null !== $this->secretKey) {
            $res['secret_key'] = $this->secretKey;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBaasEbcUserCertRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['region_name'])) {
            $model->regionName = $map['region_name'];
        }
        if (isset($map['cert_code'])) {
            $model->certCode = $map['cert_code'];
        }
        if (isset($map['cert_description'])) {
            $model->certDescription = $map['cert_description'];
        }
        if (isset($map['cert_end_time'])) {
            $model->certEndTime = $map['cert_end_time'];
        }
        if (isset($map['cert_name_cn'])) {
            $model->certNameCn = $map['cert_name_cn'];
        }
        if (isset($map['cert_name_en'])) {
            $model->certNameEn = $map['cert_name_en'];
        }
        if (isset($map['cert_publish_time'])) {
            $model->certPublishTime = $map['cert_publish_time'];
        }
        if (isset($map['cert_publish_time_zone'])) {
            $model->certPublishTimeZone = $map['cert_publish_time_zone'];
        }
        if (isset($map['cert_start_time'])) {
            $model->certStartTime = $map['cert_start_time'];
        }
        if (isset($map['cert_status'])) {
            $model->certStatus = $map['cert_status'];
        }
        if (isset($map['cert_summary'])) {
            $model->certSummary = $map['cert_summary'];
        }
        if (isset($map['country'])) {
            $model->country = $map['country'];
        }
        if (isset($map['expire_type'])) {
            $model->expireType = $map['expire_type'];
        }
        if (isset($map['holder_name'])) {
            $model->holderName = $map['holder_name'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['org_did'])) {
            $model->orgDid = $map['org_did'];
        }
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }
        if (isset($map['org_user_id'])) {
            $model->orgUserId = $map['org_user_id'];
        }
        if (isset($map['primary_id_no'])) {
            $model->primaryIdNo = $map['primary_id_no'];
        }
        if (isset($map['privacy_desc_list'])) {
            if (!empty($map['privacy_desc_list'])) {
                $model->privacyDescList = [];
                $n                      = 0;
                foreach ($map['privacy_desc_list'] as $item) {
                    $model->privacyDescList[$n++] = null !== $item ? PrivacyDesc::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['proxy_desc_list'])) {
            if (!empty($map['proxy_desc_list'])) {
                $model->proxyDescList = [];
                $n                    = 0;
                foreach ($map['proxy_desc_list'] as $item) {
                    $model->proxyDescList[$n++] = null !== $item ? ProxyDesc::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['public_desc_list'])) {
            if (!empty($map['public_desc_list'])) {
                $model->publicDescList = [];
                $n                     = 0;
                foreach ($map['public_desc_list'] as $item) {
                    $model->publicDescList[$n++] = null !== $item ? PublicDesc::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['second_id_no_1'])) {
            $model->secondIdNo1 = $map['second_id_no_1'];
        }
        if (isset($map['second_id_no_2'])) {
            $model->secondIdNo2 = $map['second_id_no_2'];
        }
        if (isset($map['second_id_no_3'])) {
            $model->secondIdNo3 = $map['second_id_no_3'];
        }
        if (isset($map['secret_key'])) {
            $model->secretKey = $map['secret_key'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
