<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class Cert extends Model {
    protected $_name = [
        'certCode' => 'cert_code',
        'certEndTime' => 'cert_end_time',
        'certId' => 'cert_id',
        'certNameCn' => 'cert_name_cn',
        'certNameEn' => 'cert_name_en',
        'certPublishTime' => 'cert_publish_time',
        'certStartTime' => 'cert_start_time',
        'certStatus' => 'cert_status',
        'certUrl' => 'cert_url',
        'country' => 'country',
        'expireType' => 'expire_type',
        'featureUrl' => 'feature_url',
        'holderAvatar' => 'holder_avatar',
        'holderName' => 'holder_name',
        'level' => 'level',
        'orgDid' => 'org_did',
        'orgName' => 'org_name',
        'orgUserId' => 'org_user_id',
        'primaryIdNo' => 'primary_id_no',
        'secondIdNo1' => 'second_id_no_1',
        'secondIdNo2' => 'second_id_no_2',
        'secondIdNo3' => 'second_id_no_3',
        'type' => 'type',
    ];
    public function validate() {
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
        Model::validatePattern('certEndTime', $this->certEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?');
        Model::validatePattern('certPublishTime', $this->certPublishTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?');
        Model::validatePattern('certStartTime', $this->certStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->certCode) {
            $res['cert_code'] = $this->certCode;
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
        if (null !== $this->certStartTime) {
            $res['cert_start_time'] = $this->certStartTime;
        }
        if (null !== $this->certStatus) {
            $res['cert_status'] = $this->certStatus;
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
     * @return Cert
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cert_code'])){
            $model->certCode = $map['cert_code'];
        }
        if(isset($map['cert_end_time'])){
            $model->certEndTime = $map['cert_end_time'];
        }
        if(isset($map['cert_id'])){
            $model->certId = $map['cert_id'];
        }
        if(isset($map['cert_name_cn'])){
            $model->certNameCn = $map['cert_name_cn'];
        }
        if(isset($map['cert_name_en'])){
            $model->certNameEn = $map['cert_name_en'];
        }
        if(isset($map['cert_publish_time'])){
            $model->certPublishTime = $map['cert_publish_time'];
        }
        if(isset($map['cert_start_time'])){
            $model->certStartTime = $map['cert_start_time'];
        }
        if(isset($map['cert_status'])){
            $model->certStatus = $map['cert_status'];
        }
        if(isset($map['cert_url'])){
            $model->certUrl = $map['cert_url'];
        }
        if(isset($map['country'])){
            $model->country = $map['country'];
        }
        if(isset($map['expire_type'])){
            $model->expireType = $map['expire_type'];
        }
        if(isset($map['feature_url'])){
            $model->featureUrl = $map['feature_url'];
        }
        if(isset($map['holder_avatar'])){
            $model->holderAvatar = $map['holder_avatar'];
        }
        if(isset($map['holder_name'])){
            $model->holderName = $map['holder_name'];
        }
        if(isset($map['level'])){
            $model->level = $map['level'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        if(isset($map['org_name'])){
            $model->orgName = $map['org_name'];
        }
        if(isset($map['org_user_id'])){
            $model->orgUserId = $map['org_user_id'];
        }
        if(isset($map['primary_id_no'])){
            $model->primaryIdNo = $map['primary_id_no'];
        }
        if(isset($map['second_id_no_1'])){
            $model->secondIdNo1 = $map['second_id_no_1'];
        }
        if(isset($map['second_id_no_2'])){
            $model->secondIdNo2 = $map['second_id_no_2'];
        }
        if(isset($map['second_id_no_3'])){
            $model->secondIdNo3 = $map['second_id_no_3'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        return $model;
    }
    /**
     * @example 0001
     * @description 证书编号
     * @var string
     */
    public $certCode;

    /**
     * @example 2018-10-10T10:10:00Z
     * @description 时间周期结束时间
     * @var string
     */
    public $certEndTime;

    /**
     * @example 0001
     * @description 证书id
     * @var string
     */
    public $certId;

    /**
     * @example 四六级
     * @description 证书名称-中文
     * @var string
     */
    public $certNameCn;

    /**
     * @example CET
     * @description 证书名称-英文（拼音）
     * @var string
     */
    public $certNameEn;

    /**
     * @example 2018-10-10T10:10:00Z
     * @description 首次发布时间
     * @var string
     */
    public $certPublishTime;

    /**
     * @example 2018-10-10T10:10:00Z
     * @description 时间周期开始时间
     * @var string
     */
    public $certStartTime;

    /**
     * @example 1
     * @description 1-有效
2-冻结
3-失效
4-作废
5-其他
     * @var integer
     */
    public $certStatus;

    /**
     * @example https://xxx.aliyuncs.com/xxx/xx/xx/xx.xlsx?Expires=1589536141&OSSAccessKeyId=TMP.3 
     * @description 实体证书图片url
     * @var string
     */
    public $certUrl;

    /**
     * @example 001
     * @description 证书归属国家
使用“ISO 3166-1”代码表-数字码
https://zh.wikipedia.org/wiki/ISO_3166-1
     * @var string
     */
    public $country;

    /**
     * @example 1
     * @description 1.长期有效
2.时间周期
     * @var integer
     */
    public $expireType;

    /**
     * @example https://xxx.aliyuncs.com/xxx/xx/xx/xx.xlsx?Expires=1589536141&OSSAccessKeyId=TMP.3
     * @description 其他信息文件url
     * @var string
     */
    public $featureUrl;

    /**
     * @example  https://xxx.aliyuncs.com/xxx/xx/xx/xx.xlsx?Expires=1589536141&OSSAccessKeyId=TMP.3Kep
     * @description 持有人的人脸图像url
     * @var string
     */
    public $holderAvatar;

    /**
     * @example 张三
     * @description 证书持有人姓名
     * @var string
     */
    public $holderName;

    /**
     * @example 初级（五级）
     * @description 证书等级类型：
初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
     * @var string
     */
    public $level;

    /**
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @description 企业did
     * @var string
     */
    public $orgDid;

    /**
     * @example 蚂蚁金服
     * @description 企业名称
     * @var string
     */
    public $orgName;

    /**
     * @example 0001
     * @description 证书持有人id
     * @var string
     */
    public $orgUserId;

    /**
     * @example 0000000000000000
     * @description 持有人主证件编号，无身份证的个人使用0000000000000000
     * @var string
     */
    public $primaryIdNo;

    /**
     * @example G1223333
     * @description 持有人辅助证件编号-1
     * @var string
     */
    public $secondIdNo1;

    /**
     * @example G1223333
     * @description 持有人辅助证件编号-2
     * @var string
     */
    public $secondIdNo2;

    /**
     * @example G12233333
     * @description 持有人辅助证件编号-3
     * @var string
     */
    public $secondIdNo3;

    /**
     * @example XLZ
     * @description -数字码类型为156时可使用如下类目：
--学历证书-XLZ
--职业证书--ZYZ
-其他国家传入--QT
     * @var string
     */
    public $type;

}
