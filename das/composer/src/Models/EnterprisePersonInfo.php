<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class EnterprisePersonInfo extends Model
{
    // 查询人对应企业名
    /**
     * @example **公司
     *
     * @var string
     */
    public $orgName;

    // 查询人持股信息
    /**
     * @example
     *
     * @var StockHolder
     */
    public $stockholder;

    // 查询人所在公司基本信息
    /**
     * @example
     *
     * @var EnterpriseBasicInfo
     */
    public $basicInfo;

    // 查询人与这家企业的关联:sh 股东;lp 法人;tm 高管
    /**
     * @example
     *
     * @var string[]
     */
    public $relationship;
    protected $_name = [
        'orgName'      => 'org_name',
        'stockholder'  => 'stockholder',
        'basicInfo'    => 'basic_info',
        'relationship' => 'relationship',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        if (null !== $this->stockholder) {
            $res['stockholder'] = null !== $this->stockholder ? $this->stockholder->toMap() : null;
        }
        if (null !== $this->basicInfo) {
            $res['basic_info'] = null !== $this->basicInfo ? $this->basicInfo->toMap() : null;
        }
        if (null !== $this->relationship) {
            $res['relationship'] = $this->relationship;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterprisePersonInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }
        if (isset($map['stockholder'])) {
            $model->stockholder = StockHolder::fromMap($map['stockholder']);
        }
        if (isset($map['basic_info'])) {
            $model->basicInfo = EnterpriseBasicInfo::fromMap($map['basic_info']);
        }
        if (isset($map['relationship'])) {
            if (!empty($map['relationship'])) {
                $model->relationship = $map['relationship'];
            }
        }

        return $model;
    }
}
