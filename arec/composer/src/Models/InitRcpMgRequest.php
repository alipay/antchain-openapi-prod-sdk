<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class InitRcpMgRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 银行编号
    /**
     * @var string
     */
    public $bankNo;

    // 抵押单号
    /**
     * @var string
     */
    public $mgOrderNo;

    // 确认预抵押结论，Y-表示继续，N-表示中止
    /**
     * @var string
     */
    public $result;

    // 中止抵押的原因code
    /**
     * @var string
     */
    public $failCode;

    // 中止抵押的原因描述
    /**
     * @var string
     */
    public $failDesc;

    // 抵押登记相关合同变量和值全集，Map<String,String>的json格式
    /**
     * @var string
     */
    public $arVarValueJson;

    // 抵押担保信息
    /**
     * @var MortGuaranteeInfo
     */
    public $mgOrderMortGuarantee;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'bankNo'               => 'bank_no',
        'mgOrderNo'            => 'mg_order_no',
        'result'               => 'result',
        'failCode'             => 'fail_code',
        'failDesc'             => 'fail_desc',
        'arVarValueJson'       => 'ar_var_value_json',
        'mgOrderMortGuarantee' => 'mg_order_mort_guarantee',
    ];

    public function validate()
    {
        Model::validateRequired('bankNo', $this->bankNo, true);
        Model::validateRequired('mgOrderNo', $this->mgOrderNo, true);
        Model::validateRequired('result', $this->result, true);
        Model::validateRequired('arVarValueJson', $this->arVarValueJson, true);
        Model::validateRequired('mgOrderMortGuarantee', $this->mgOrderMortGuarantee, true);
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
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->mgOrderNo) {
            $res['mg_order_no'] = $this->mgOrderNo;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->failCode) {
            $res['fail_code'] = $this->failCode;
        }
        if (null !== $this->failDesc) {
            $res['fail_desc'] = $this->failDesc;
        }
        if (null !== $this->arVarValueJson) {
            $res['ar_var_value_json'] = $this->arVarValueJson;
        }
        if (null !== $this->mgOrderMortGuarantee) {
            $res['mg_order_mort_guarantee'] = null !== $this->mgOrderMortGuarantee ? $this->mgOrderMortGuarantee->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitRcpMgRequest
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
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['mg_order_no'])) {
            $model->mgOrderNo = $map['mg_order_no'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['fail_code'])) {
            $model->failCode = $map['fail_code'];
        }
        if (isset($map['fail_desc'])) {
            $model->failDesc = $map['fail_desc'];
        }
        if (isset($map['ar_var_value_json'])) {
            $model->arVarValueJson = $map['ar_var_value_json'];
        }
        if (isset($map['mg_order_mort_guarantee'])) {
            $model->mgOrderMortGuarantee = MortGuaranteeInfo::fromMap($map['mg_order_mort_guarantee']);
        }

        return $model;
    }
}
