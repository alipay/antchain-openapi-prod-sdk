<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_68b3ee3230284cddaa19740dcaf251d8\Models;

use AlibabaCloud\Tea\Model;

class AbilityApiRelation extends Model
{
    // api名称
    /**
     * @example antchain.saas.ability.withproduct.query
     *
     * @var string
     */
    public $apiName;

    // 能力列表
    /**
     * @example [{"abilityId":"ak_3821c8f0145440dab91b9b23edb1dc73","abilityName":"B2B支付网关","devOwner":"张三","gmtCreate":"2023-01-02 12:00:00","description":"适用场景：企业资金支付场景 适合行业：存在企业采购/企业充值/企业转账等企业支付场景的行业 归属行业线：B类基础产品 产品描述：将交易场景与企业对公账户支付线上关联，订单交易对应的支付"}]
     *
     * @var AbilityInfo[]
     */
    public $abilityInfoList;
    protected $_name = [
        'apiName'         => 'api_name',
        'abilityInfoList' => 'ability_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('abilityInfoList', $this->abilityInfoList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->abilityInfoList) {
            $res['ability_info_list'] = [];
            if (null !== $this->abilityInfoList && \is_array($this->abilityInfoList)) {
                $n = 0;
                foreach ($this->abilityInfoList as $item) {
                    $res['ability_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AbilityApiRelation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['ability_info_list'])) {
            if (!empty($map['ability_info_list'])) {
                $model->abilityInfoList = [];
                $n                      = 0;
                foreach ($map['ability_info_list'] as $item) {
                    $model->abilityInfoList[$n++] = null !== $item ? AbilityInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
