<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MerchantSupportEvidence extends Model
{
    // 商家操作(拒绝)时间
    /**
     * @example 2025-01-01 12:00:00
     *
     * @var string
     */
    public $merchantOperateTime;

    // 商家拒绝原因
    /**
     * @example 理由
     *
     * @var string
     */
    public $merchantRefuseReason;

    // 商家拒绝举证材料
    /**
     * @example ["fileKey"]
     *
     * @var string[]
     */
    public $merchantRefuseEvidences;
    protected $_name = [
        'merchantOperateTime'     => 'merchant_operate_time',
        'merchantRefuseReason'    => 'merchant_refuse_reason',
        'merchantRefuseEvidences' => 'merchant_refuse_evidences',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->merchantOperateTime) {
            $res['merchant_operate_time'] = $this->merchantOperateTime;
        }
        if (null !== $this->merchantRefuseReason) {
            $res['merchant_refuse_reason'] = $this->merchantRefuseReason;
        }
        if (null !== $this->merchantRefuseEvidences) {
            $res['merchant_refuse_evidences'] = $this->merchantRefuseEvidences;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantSupportEvidence
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['merchant_operate_time'])) {
            $model->merchantOperateTime = $map['merchant_operate_time'];
        }
        if (isset($map['merchant_refuse_reason'])) {
            $model->merchantRefuseReason = $map['merchant_refuse_reason'];
        }
        if (isset($map['merchant_refuse_evidences'])) {
            if (!empty($map['merchant_refuse_evidences'])) {
                $model->merchantRefuseEvidences = $map['merchant_refuse_evidences'];
            }
        }

        return $model;
    }
}
