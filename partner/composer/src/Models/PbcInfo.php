<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class PbcInfo extends Model
{
    // 支行名称
    /**
     * @example 中国建设银行股份有限公司潜江江汉支行
     *
     * @var string
     */
    public $branchName;

    // 联行号数据
    /**
     * @example 1111
     *
     * @var string
     */
    public $bankCode;
    protected $_name = [
        'branchName' => 'branch_name',
        'bankCode'   => 'bank_code',
    ];

    public function validate()
    {
        Model::validateRequired('branchName', $this->branchName, true);
        Model::validateRequired('bankCode', $this->bankCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->branchName) {
            $res['branch_name'] = $this->branchName;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PbcInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['branch_name'])) {
            $model->branchName = $map['branch_name'];
        }
        if (isset($map['bank_code'])) {
            $model->bankCode = $map['bank_code'];
        }

        return $model;
    }
}
