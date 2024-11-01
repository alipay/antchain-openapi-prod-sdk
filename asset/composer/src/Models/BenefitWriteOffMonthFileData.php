<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ASSET\Models;

use AlibabaCloud\Tea\Model;

class BenefitWriteOffMonthFileData extends Model
{
    // 所属月份
    /**
     * @example 202409
     *
     * @var string
     */
    public $billingMonth;

    // AFTS 上传到文件 id
    /**
     * @example A*ydC-QapBk8gAAAAAAAAAAAAAT-iRAw
     *
     * @var string
     */
    public $fileFiledId;
    protected $_name = [
        'billingMonth' => 'billing_month',
        'fileFiledId'  => 'file_filed_id',
    ];

    public function validate()
    {
        Model::validateRequired('billingMonth', $this->billingMonth, true);
        Model::validateRequired('fileFiledId', $this->fileFiledId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->billingMonth) {
            $res['billing_month'] = $this->billingMonth;
        }
        if (null !== $this->fileFiledId) {
            $res['file_filed_id'] = $this->fileFiledId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BenefitWriteOffMonthFileData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['billing_month'])) {
            $model->billingMonth = $map['billing_month'];
        }
        if (isset($map['file_filed_id'])) {
            $model->fileFiledId = $map['file_filed_id'];
        }

        return $model;
    }
}
