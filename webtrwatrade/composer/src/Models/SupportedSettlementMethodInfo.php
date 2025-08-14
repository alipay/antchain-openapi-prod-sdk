<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class SupportedSettlementMethodInfo extends Model
{
    // 结算方式枚举：TD或TT
    /**
     * @example TD
     *
     * @var string
     */
    public $settlementMethodEnum;

    // 结算银行账户id
    /**
     * @example 18129343249234
     *
     * @var string
     */
    public $relatedSettlementAccountId;
    protected $_name = [
        'settlementMethodEnum'       => 'settlement_method_enum',
        'relatedSettlementAccountId' => 'related_settlement_account_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->settlementMethodEnum) {
            $res['settlement_method_enum'] = $this->settlementMethodEnum;
        }
        if (null !== $this->relatedSettlementAccountId) {
            $res['related_settlement_account_id'] = $this->relatedSettlementAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SupportedSettlementMethodInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['settlement_method_enum'])) {
            $model->settlementMethodEnum = $map['settlement_method_enum'];
        }
        if (isset($map['related_settlement_account_id'])) {
            $model->relatedSettlementAccountId = $map['related_settlement_account_id'];
        }

        return $model;
    }
}
