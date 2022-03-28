<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDubbridgeInstitutionCreditRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 机构请求流水号，用于幂等。行方需确保唯一性
    /**
     * @var string
     */
    public $serialNo;

    // 授信编号，授信申请时同申请单号一致，调额等操作同前授信申请时的授信编号一致
    /**
     * @var string
     */
    public $creditNo;

    // 客户姓名
    /**
     * @var string
     */
    public $name;

    // 身份证号
    /**
     * @var string
     */
    public $certNo;

    // ADJUST_AMT_APPLY|ADJUST_RATE_APPLY|CLEAR_UP_APPLY|FROZEN_APPLY|UN_FROZEN_APPLY
    /**
     * @var string
     */
    public $applyType;

    // 基础固额-申请调整值，单位分，机构发起调额场景下有值
    /**
     * @var string
     */
    public $creditAmount;

    // 年利率-申请调整值，机构发起调价场景下有值
    /**
     * @var string
     */
    public $creditRate;

    // 申请来源
    /**
     * @var string
     */
    public $source;

    // 机构申请原因码
    /**
     * @var string
     */
    public $reasonCode;

    // 机构发起原因描述
    /**
     * @var string
     */
    public $reasonMsg;

    // 透传授信阶段天枢字段，json格式
    /**
     * @var string
     */
    public $extInfoTs;

    // 扩展信息，json格式
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serialNo'          => 'serial_no',
        'creditNo'          => 'credit_no',
        'name'              => 'name',
        'certNo'            => 'cert_no',
        'applyType'         => 'apply_type',
        'creditAmount'      => 'credit_amount',
        'creditRate'        => 'credit_rate',
        'source'            => 'source',
        'reasonCode'        => 'reason_code',
        'reasonMsg'         => 'reason_msg',
        'extInfoTs'         => 'ext_info_ts',
        'extInfo'           => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('serialNo', $this->serialNo, true);
        Model::validateRequired('creditNo', $this->creditNo, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('applyType', $this->applyType, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('reasonCode', $this->reasonCode, true);
        Model::validateRequired('reasonMsg', $this->reasonMsg, true);
        Model::validateRequired('extInfoTs', $this->extInfoTs, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
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
        if (null !== $this->serialNo) {
            $res['serial_no'] = $this->serialNo;
        }
        if (null !== $this->creditNo) {
            $res['credit_no'] = $this->creditNo;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->applyType) {
            $res['apply_type'] = $this->applyType;
        }
        if (null !== $this->creditAmount) {
            $res['credit_amount'] = $this->creditAmount;
        }
        if (null !== $this->creditRate) {
            $res['credit_rate'] = $this->creditRate;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->reasonCode) {
            $res['reason_code'] = $this->reasonCode;
        }
        if (null !== $this->reasonMsg) {
            $res['reason_msg'] = $this->reasonMsg;
        }
        if (null !== $this->extInfoTs) {
            $res['ext_info_ts'] = $this->extInfoTs;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDubbridgeInstitutionCreditRequest
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
        if (isset($map['serial_no'])) {
            $model->serialNo = $map['serial_no'];
        }
        if (isset($map['credit_no'])) {
            $model->creditNo = $map['credit_no'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['apply_type'])) {
            $model->applyType = $map['apply_type'];
        }
        if (isset($map['credit_amount'])) {
            $model->creditAmount = $map['credit_amount'];
        }
        if (isset($map['credit_rate'])) {
            $model->creditRate = $map['credit_rate'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['reason_code'])) {
            $model->reasonCode = $map['reason_code'];
        }
        if (isset($map['reason_msg'])) {
            $model->reasonMsg = $map['reason_msg'];
        }
        if (isset($map['ext_info_ts'])) {
            $model->extInfoTs = $map['ext_info_ts'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
