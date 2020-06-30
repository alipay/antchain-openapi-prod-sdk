<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateUserCertRequest extends Model {
    protected $_name = [
        'certCode' => 'cert_code',
        'certEndTime' => 'cert_end_time',
        'certNameCn' => 'cert_name_cn',
        'certNameEn' => 'cert_name_en',
        'certPublishTime' => 'cert_publish_time',
        'certStartTime' => 'cert_start_time',
        'certStatus' => 'cert_status',
        'country' => 'country',
        'expireType' => 'expire_type',
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
        Model::validateMaxLength('certNameCn', $this->certNameCn, 64);
        Model::validateMaxLength('certNameEn', $this->certNameEn, 64);
        Model::validateMaxLength('country', $this->country, 32);
        Model::validateMaxLength('holderName', $this->holderName, 64);
        Model::validateMaxLength('level', $this->level, 32);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validateMaxLength('orgName', $this->orgName, 64);
        Model::validateMaxLength('orgUserId', $this->orgUserId, 128);
        Model::validateMaxLength('primaryIdNo', $this->primaryIdNo, 1024);
        Model::validateMaxLength('secondIdNo1', $this->secondIdNo1, 1024);
        Model::validateMaxLength('secondIdNo2', $this->secondIdNo2, 1024);
        Model::validateMaxLength('secondIdNo3', $this->secondIdNo3, 1024);
        Model::validateMaxLength('type', $this->type, 64);
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
     * @return CreateUserCertRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cert_code'])){
            $model->certCode = $map['cert_code'];
        }
        if(isset($map['cert_end_time'])){
            $model->certEndTime = $map['cert_end_time'];
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
        if(isset($map['country'])){
            $model->country = $map['country'];
        }
        if(isset($map['expire_type'])){
            $model->expireType = $map['expire_type'];
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
     * @description 证书编号
     * @example 0001
     * @var string
     */
    public $certCode;

    /**
     * @description 时间周期结束时间
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $certEndTime;

    /**
     * @description 证书名称-中文
     * @example 四六级
     * @var string
     */
    public $certNameCn;

    /**
     * @description 证书名称-英文（拼音）
     * @example CET
     * @var string
     */
    public $certNameEn;

    /**
     * @description 首次发布时间
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $certPublishTime;

    /**
     * @description 时间周期开始时间
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $certStartTime;

    /**
     * @description 1-有效 2-冻结 3-失效 4-作废 5-其他
     * @example 1
     * @var integer
     */
    public $certStatus;

    /**
     * @description 证书归属国家 使用“ISO 3166-1”代码表-数字码 https://zh.wikipedia.org/wiki/ISO_3166-1
     * @example 001
     * @var string
     */
    public $country;

    /**
     * @description 有效期类型1.长期有效 2.时间周期
     * @example 1
     * @var integer
     */
    public $expireType;

    /**
     * @description 证书持有人姓名

     * @example 张三
     * @var string
     */
    public $holderName;

    /**
     * @description 证书等级类型： 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
     * @example 初级（五级）
     * @var string
     */
    public $level;

    /**
     * @description 企业id
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $orgDid;

    /**
     * @description 企业名称
     * @example 蚂蚁金服 
     * @var string
     */
    public $orgName;

    /**
     * @description 企业用户id
     * @example 0001
     * @var string
     */
    public $orgUserId;

    /**
     * @description 持有人主证件编号，无身份证的个人使用0000000000000000
请使用我们提供的公钥对数据进行加密

     * @example 0000000000000000
     * @var string
     */
    public $primaryIdNo;

    /**
     * @description 持有人辅助证件编号-1
请使用我们提供的公钥对数据进行加密
     * @example G1223333
     * @var string
     */
    public $secondIdNo1;

    /**
     * @description 持有人辅助证件编号-2
请使用我们提供的公钥对数据进行加密
     * @example G1223333
     * @var string
     */
    public $secondIdNo2;

    /**
     * @description 持有人辅助证件编号-3
请使用我们提供的公钥对数据进行加密
     * @example G12233333
     * @var string
     */
    public $secondIdNo3;

    /**
     * @description -数字码类型为156时可使用如下类目： --学历证书-XLZ --职业证书--ZYZ -其他国家传入--QT
     * @example XLZ
     * @var string
     */
    public $type;

}
