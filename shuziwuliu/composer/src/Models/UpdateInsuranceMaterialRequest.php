<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UpdateInsuranceMaterialRequest extends Model
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

    // 交易流水号，调用方生成的唯一编码，格式
    // 为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
    /**
     * @var string
     */
    public $tradeNo;

    // 保司编码，PAIC---平安、CPIC---太保
    /**
     * @var string
     */
    public $externalChannelCode;

    // 险种编码：05-驿站宝
    /**
     * @var string
     */
    public $externalProductCode;

    // 保司报案所返回的案件号
    /**
     * @var string
     */
    public $reportNo;

    // 案件所关联的保单号信息
    /**
     * @var string
     */
    public $policyNo;

    // 客诉材料-更新状态集 UPDATE-更新/覆盖、INCREASE-增加
    /**
     * @var string
     */
    public $documentUpdateMode;

    // 案件材料
    /**
     * @var Document[]
     */
    public $documents;

    // 收款人账户信息
    /**
     * @var PaymentInfo
     */
    public $paymentInfo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'tradeNo'             => 'trade_no',
        'externalChannelCode' => 'external_channel_code',
        'externalProductCode' => 'external_product_code',
        'reportNo'            => 'report_no',
        'policyNo'            => 'policy_no',
        'documentUpdateMode'  => 'document_update_mode',
        'documents'           => 'documents',
        'paymentInfo'         => 'payment_info',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('externalProductCode', $this->externalProductCode, true);
        Model::validateRequired('reportNo', $this->reportNo, true);
        Model::validateRequired('documentUpdateMode', $this->documentUpdateMode, true);
        Model::validateRequired('documents', $this->documents, true);
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->externalChannelCode) {
            $res['external_channel_code'] = $this->externalChannelCode;
        }
        if (null !== $this->externalProductCode) {
            $res['external_product_code'] = $this->externalProductCode;
        }
        if (null !== $this->reportNo) {
            $res['report_no'] = $this->reportNo;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->documentUpdateMode) {
            $res['document_update_mode'] = $this->documentUpdateMode;
        }
        if (null !== $this->documents) {
            $res['documents'] = [];
            if (null !== $this->documents && \is_array($this->documents)) {
                $n = 0;
                foreach ($this->documents as $item) {
                    $res['documents'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->paymentInfo) {
            $res['payment_info'] = null !== $this->paymentInfo ? $this->paymentInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateInsuranceMaterialRequest
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
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['external_channel_code'])) {
            $model->externalChannelCode = $map['external_channel_code'];
        }
        if (isset($map['external_product_code'])) {
            $model->externalProductCode = $map['external_product_code'];
        }
        if (isset($map['report_no'])) {
            $model->reportNo = $map['report_no'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['document_update_mode'])) {
            $model->documentUpdateMode = $map['document_update_mode'];
        }
        if (isset($map['documents'])) {
            if (!empty($map['documents'])) {
                $model->documents = [];
                $n                = 0;
                foreach ($map['documents'] as $item) {
                    $model->documents[$n++] = null !== $item ? Document::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['payment_info'])) {
            $model->paymentInfo = PaymentInfo::fromMap($map['payment_info']);
        }

        return $model;
    }
}
