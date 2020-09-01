<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class Cert extends Model
{
    // 证书编号
    /**
     * @example 0001
     *
     * @var string
     */
    public $certCode;

    // 证书描述
    /**
     * @example 证书描述
     *
     * @var string
     */
    public $certDescription;

    // 时间周期结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $certEndTime;

    // 证书id
    /**
     * @example 0001
     *
     * @var string
     */
    public $certId;

    // 证书名称-中文
    /**
     * @example 四六级
     *
     * @var string
     */
    public $certNameCn;

    // 证书名称-英文（拼音）
    /**
     * @example CET
     *
     * @var string
     */
    public $certNameEn;

    // 首次发布时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $certPublishTime;

    // 发布时间时区，默认UTC+8
    //
    /**
     * @example UTC+8
     *
     * @var string
     */
    public $certPublishTimeZone;

    // 时间周期开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $certStartTime;

    // 1-有效
    // 2-冻结
    // 3-失效
    // 4-作废
    // 5-其他
    /**
     * @example 1
     *
     * @var int
     */
    public $certStatus;

    // 证书概述
    /**
     * @example 证书概述
     *
     * @var string
     */
    public $certSummary;

    // 实体证书图片url
    /**
     * @example https://xxx.aliyuncs.com/xxx/xx/xx/xx.xlsx?Expires=1589536141&OSSAccessKeyId=TMP.3
     *
     * @var string
     */
    public $certUrl;

    // 证书归属国家
    // 使用“ISO 3166-1”代码表-数字码
    // https://zh.wikipedia.org/wiki/ISO_3166-1
    /**
     * @example 001
     *
     * @var string
     */
    public $country;

    // 1.长期有效
    // 2.时间周期
    /**
     * @example 1
     *
     * @var int
     */
    public $expireType;

    // 其他信息文件url
    /**
     * @example https://xxx.aliyuncs.com/xxx/xx/xx/xx.xlsx?Expires=1589536141&OSSAccessKeyId=TMP.3
     *
     * @var string
     */
    public $featureUrl;

    // 持有人的人脸图像url
    /**
     * @example  https://xxx.aliyuncs.com/xxx/xx/xx/xx.xlsx?Expires=1589536141&OSSAccessKeyId=TMP.3Kep
     *
     * @var string
     */
    public $holderAvatar;

    // 证书持有人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $holderName;

    // 证书等级类型：
    // 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
    /**
     * @example 初级（五级）
     *
     * @var string
     */
    public $level;

    // 企业did
    /**
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36
     *
     * @var string
     */
    public $orgDid;

    // 企业名称
    /**
     * @example 蚂蚁金服
     *
     * @var string
     */
    public $orgName;

    // 证书持有人id
    /**
     * @example 0001
     *
     * @var string
     */
    public $orgUserId;

    // 持有人主证件编号，无身份证的个人使用0000000000000000
    /**
     * @example 0000000000000000
     *
     * @var string
     */
    public $primaryIdNo;

    // 持有人辅助证件编号-1
    /**
     * @example G1223333
     *
     * @var string
     */
    public $secondIdNo1;

    // 持有人辅助证件编号-2
    /**
     * @example G1223333
     *
     * @var string
     */
    public $secondIdNo2;

    // 持有人辅助证件编号-3
    /**
     * @example G12233333
     *
     * @var string
     */
    public $secondIdNo3;

    // -数字码类型为156时可使用如下类目：
    // --学历证书-XLZ
    // --职业证书--ZYZ
    // -其他国家传入--QT
    /**
     * @example XLZ
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'certCode'            => 'cert_code',
        'certDescription'     => 'cert_description',
        'certEndTime'         => 'cert_end_time',
        'certId'              => 'cert_id',
        'certNameCn'          => 'cert_name_cn',
        'certNameEn'          => 'cert_name_en',
        'certPublishTime'     => 'cert_publish_time',
        'certPublishTimeZone' => 'cert_publish_time_zone',
        'certStartTime'       => 'cert_start_time',
        'certStatus'          => 'cert_status',
        'certSummary'         => 'cert_summary',
        'certUrl'             => 'cert_url',
        'country'             => 'country',
        'expireType'          => 'expire_type',
        'featureUrl'          => 'feature_url',
        'holderAvatar'        => 'holder_avatar',
        'holderName'          => 'holder_name',
        'level'               => 'level',
        'orgDid'              => 'org_did',
        'orgName'             => 'org_name',
        'orgUserId'           => 'org_user_id',
        'primaryIdNo'         => 'primary_id_no',
        'secondIdNo1'         => 'second_id_no_1',
        'secondIdNo2'         => 'second_id_no_2',
        'secondIdNo3'         => 'second_id_no_3',
        'type'                => 'type',
    ];

    public function validate()
    {
        Model::validateMaxLength('certCode', $this->certCode, 64);
        Model::validateMaxLength('certId', $this->certId, 128);
        Model::validateMaxLength('certNameCn', $this->certNameCn, 64);
        Model::validateMaxLength('certUrl', $this->certUrl, 256);
        Model::validateMaxLength('country', $this->country, 32);
        Model::validateMaxLength('featureUrl', $this->featureUrl, 512);
        Model::validateMaxLength('holderAvatar', $this->holderAvatar, 256);
        Model::validateMaxLength('holderName', $this->holderName, 64);
        Model::validateMaxLength('level', $this->level, 32);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validateMaxLength('orgName', $this->orgName, 64);
        Model::validateMaxLength('orgUserId', $this->orgUserId, 128);
        Model::validateMaxLength('primaryIdNo', $this->primaryIdNo, 64);
        Model::validateMaxLength('secondIdNo1', $this->secondIdNo1, 64);
        Model::validateMaxLength('secondIdNo2', $this->secondIdNo2, 64);
        Model::validateMaxLength('secondIdNo3', $this->secondIdNo3, 64);
        Model::validatePattern('certEndTime', $this->certEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('certPublishTime', $this->certPublishTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('certStartTime', $this->certStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certCode) {
            $res['cert_code'] = $this->certCode;
        }
        if (null !== $this->certDescription) {
            $res['cert_description'] = $this->certDescription;
        }
        if (null !== $this->certEndTime) {
            $res['cert_end_time'] = $this->certEndTime;
        }
        if (null !== $this->certId) {
            $res['cert_id'] = $this->certId;
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
        if (null !== $this->certUrl) {
            $res['cert_url'] = $this->certUrl;
        }
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }
        if (null !== $this->expireType) {
            $res['expire_type'] = $this->expireType;
        }
        if (null !== $this->featureUrl) {
            $res['feature_url'] = $this->featureUrl;
        }
        if (null !== $this->holderAvatar) {
            $res['holder_avatar'] = $this->holderAvatar;
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
        if (null !== $this->secondIdNo1) {
            $res['second_id_no_1'] = $this->secondIdNo1;
        }
        if (null !== $this->secondIdNo2) {
            $res['second_id_no_2'] = $this->secondIdNo2;
        }
        if (null !== $this->secondIdNo3) {
            $res['second_id_no_3'] = $this->secondIdNo3;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Cert
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert_code'])) {
            $model->certCode = $map['cert_code'];
        }
        if (isset($map['cert_description'])) {
            $model->certDescription = $map['cert_description'];
        }
        if (isset($map['cert_end_time'])) {
            $model->certEndTime = $map['cert_end_time'];
        }
        if (isset($map['cert_id'])) {
            $model->certId = $map['cert_id'];
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
        if (isset($map['cert_url'])) {
            $model->certUrl = $map['cert_url'];
        }
        if (isset($map['country'])) {
            $model->country = $map['country'];
        }
        if (isset($map['expire_type'])) {
            $model->expireType = $map['expire_type'];
        }
        if (isset($map['feature_url'])) {
            $model->featureUrl = $map['feature_url'];
        }
        if (isset($map['holder_avatar'])) {
            $model->holderAvatar = $map['holder_avatar'];
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
        if (isset($map['second_id_no_1'])) {
            $model->secondIdNo1 = $map['second_id_no_1'];
        }
        if (isset($map['second_id_no_2'])) {
            $model->secondIdNo2 = $map['second_id_no_2'];
        }
        if (isset($map['second_id_no_3'])) {
            $model->secondIdNo3 = $map['second_id_no_3'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
