<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PfVoucherCheckResult extends Model
{
    // 凭证id
    /**
     * @example 20119112323
     *
     * @var string
     */
    public $voucherId;

    // 凭证类型
    /**
     * @example WAYBILL
     *
     * @var string
     */
    public $voucherCategory;

    // 状态；PASS:通过，NO_PASS 未通过
    /**
     * @example PASS
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'voucherId'       => 'voucher_id',
        'voucherCategory' => 'voucher_category',
        'status'          => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('voucherId', $this->voucherId, true);
        Model::validateRequired('voucherCategory', $this->voucherCategory, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->voucherId) {
            $res['voucher_id'] = $this->voucherId;
        }
        if (null !== $this->voucherCategory) {
            $res['voucher_category'] = $this->voucherCategory;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PfVoucherCheckResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['voucher_id'])) {
            $model->voucherId = $map['voucher_id'];
        }
        if (isset($map['voucher_category'])) {
            $model->voucherCategory = $map['voucher_category'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
