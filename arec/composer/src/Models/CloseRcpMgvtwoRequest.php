<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class CloseRcpMgvtwoRequest extends Model
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

    // 助贷平台
    /**
     * @var string
     */
    public $loanAssistPlatform;

    // 房产链内部银行编号
    /**
     * @var string
     */
    public $bankNo;

    // 房产链抵押单
    /**
     * @var string
     */
    public $mgOrderNo;

    // 终止抵押原因码
    /**
     * @var string
     */
    public $failCode;

    // 终止抵押原因描述
    /**
     * @var string
     */
    public $failDesc;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'loanAssistPlatform' => 'loan_assist_platform',
        'bankNo'             => 'bank_no',
        'mgOrderNo'          => 'mg_order_no',
        'failCode'           => 'fail_code',
        'failDesc'           => 'fail_desc',
    ];

    public function validate()
    {
        Model::validateRequired('loanAssistPlatform', $this->loanAssistPlatform, true);
        Model::validateRequired('bankNo', $this->bankNo, true);
        Model::validateRequired('mgOrderNo', $this->mgOrderNo, true);
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
        if (null !== $this->loanAssistPlatform) {
            $res['loan_assist_platform'] = $this->loanAssistPlatform;
        }
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->mgOrderNo) {
            $res['mg_order_no'] = $this->mgOrderNo;
        }
        if (null !== $this->failCode) {
            $res['fail_code'] = $this->failCode;
        }
        if (null !== $this->failDesc) {
            $res['fail_desc'] = $this->failDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CloseRcpMgvtwoRequest
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
        if (isset($map['loan_assist_platform'])) {
            $model->loanAssistPlatform = $map['loan_assist_platform'];
        }
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['mg_order_no'])) {
            $model->mgOrderNo = $map['mg_order_no'];
        }
        if (isset($map['fail_code'])) {
            $model->failCode = $map['fail_code'];
        }
        if (isset($map['fail_desc'])) {
            $model->failDesc = $map['fail_desc'];
        }

        return $model;
    }
}
