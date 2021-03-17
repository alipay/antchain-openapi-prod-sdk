<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class ConfirmRcpMgrRequest extends Model
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

    // 解抵押单号
    /**
     * @var string
     */
    public $mgReleaseOrderNo;

    // Y=继续解抵押,N=终止解抵押
    /**
     * @var string
     */
    public $result;

    // 终止解抵押原因码
    /**
     * @var string
     */
    public $failCode;

    // 终止解抵押原因描述
    /**
     * @var string
     */
    public $failDesc;

    // 银行签署完成的解抵押合同列表
    /**
     * @var Agreement[]
     */
    public $agreements;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'loanAssistPlatform' => 'loan_assist_platform',
        'bankNo'             => 'bank_no',
        'mgReleaseOrderNo'   => 'mg_release_order_no',
        'result'             => 'result',
        'failCode'           => 'fail_code',
        'failDesc'           => 'fail_desc',
        'agreements'         => 'agreements',
    ];

    public function validate()
    {
        Model::validateRequired('loanAssistPlatform', $this->loanAssistPlatform, true);
        Model::validateRequired('bankNo', $this->bankNo, true);
        Model::validateRequired('mgReleaseOrderNo', $this->mgReleaseOrderNo, true);
        Model::validateRequired('result', $this->result, true);
        Model::validateRequired('agreements', $this->agreements, true);
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
        if (null !== $this->mgReleaseOrderNo) {
            $res['mg_release_order_no'] = $this->mgReleaseOrderNo;
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
        if (null !== $this->agreements) {
            $res['agreements'] = [];
            if (null !== $this->agreements && \is_array($this->agreements)) {
                $n = 0;
                foreach ($this->agreements as $item) {
                    $res['agreements'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmRcpMgrRequest
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
        if (isset($map['mg_release_order_no'])) {
            $model->mgReleaseOrderNo = $map['mg_release_order_no'];
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
        if (isset($map['agreements'])) {
            if (!empty($map['agreements'])) {
                $model->agreements = [];
                $n                 = 0;
                foreach ($map['agreements'] as $item) {
                    $model->agreements[$n++] = null !== $item ? Agreement::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
