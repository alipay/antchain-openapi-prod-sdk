<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractTextSignVerifyCertInfo extends Model
{
    // 证书所有者
    /**
     * @example 杭州**有限公司
     *
     * @var string
     */
    public $owner;

    // 证书序列号
    /**
     * @example 6bdea579b491bxxxxxxx
     *
     * @var string
     */
    public $serial;

    // 证书有效期开始时间
    /**
     * @example 2020-04-13 11:46:18
     *
     * @var string
     */
    public $startDate;

    // 证书有效期结束时间
    /**
     * @example 2021-04-13 11:46:18
     *
     * @var string
     */
    public $endDate;

    // 证书发布者名称
    /**
     * @example 智慧CA_测试CA
     *
     * @var string
     */
    public $issuerCn;
    protected $_name = [
        'owner'     => 'owner',
        'serial'    => 'serial',
        'startDate' => 'start_date',
        'endDate'   => 'end_date',
        'issuerCn'  => 'issuer_cn',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->serial) {
            $res['serial'] = $this->serial;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->issuerCn) {
            $res['issuer_cn'] = $this->issuerCn;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractTextSignVerifyCertInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['serial'])) {
            $model->serial = $map['serial'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['issuer_cn'])) {
            $model->issuerCn = $map['issuer_cn'];
        }

        return $model;
    }
}
