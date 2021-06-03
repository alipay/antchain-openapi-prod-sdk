<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class IssueCertParams extends Model
{
    // 贷款合同编号
    /**
     * @example 11410000005184603J
     *
     * @var string
     */
    public $dkhtbh;

    // 公积金中心个人账户
    /**
     * @example 370101199601022014
     *
     * @var string
     */
    public $grzh;

    // 查询开始日期
    /**
     * @example 2020-01-01
     *
     * @var string
     */
    public $ksrq;

    // 查询结束日期
    /**
     * @example 2020-01-01
     *
     * @var string
     */
    public $jsrq;

    // 公积金贷款中心
    /**
     * @example 中国石油集团东方地球物理勘探有限责任公司住房公积金管理中心
     *
     * @var string
     */
    public $gjjdkzx;

    // 贷款金额，单位 万元
    /**
     * @example "10"
     *
     * @var string
     */
    public $dkje;

    // 贷款期限，单位 年
    /**
     * @example "2"
     *
     * @var string
     */
    public $dkqx;
    protected $_name = [
        'dkhtbh'  => 'dkhtbh',
        'grzh'    => 'grzh',
        'ksrq'    => 'ksrq',
        'jsrq'    => 'jsrq',
        'gjjdkzx' => 'gjjdkzx',
        'dkje'    => 'dkje',
        'dkqx'    => 'dkqx',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dkhtbh) {
            $res['dkhtbh'] = $this->dkhtbh;
        }
        if (null !== $this->grzh) {
            $res['grzh'] = $this->grzh;
        }
        if (null !== $this->ksrq) {
            $res['ksrq'] = $this->ksrq;
        }
        if (null !== $this->jsrq) {
            $res['jsrq'] = $this->jsrq;
        }
        if (null !== $this->gjjdkzx) {
            $res['gjjdkzx'] = $this->gjjdkzx;
        }
        if (null !== $this->dkje) {
            $res['dkje'] = $this->dkje;
        }
        if (null !== $this->dkqx) {
            $res['dkqx'] = $this->dkqx;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IssueCertParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dkhtbh'])) {
            $model->dkhtbh = $map['dkhtbh'];
        }
        if (isset($map['grzh'])) {
            $model->grzh = $map['grzh'];
        }
        if (isset($map['ksrq'])) {
            $model->ksrq = $map['ksrq'];
        }
        if (isset($map['jsrq'])) {
            $model->jsrq = $map['jsrq'];
        }
        if (isset($map['gjjdkzx'])) {
            $model->gjjdkzx = $map['gjjdkzx'];
        }
        if (isset($map['dkje'])) {
            $model->dkje = $map['dkje'];
        }
        if (isset($map['dkqx'])) {
            $model->dkqx = $map['dkqx'];
        }

        return $model;
    }
}
