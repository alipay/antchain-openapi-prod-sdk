<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsuranceStockinRequest extends Model
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

    // 入库交易流水号，保持唯一
    /**
     * @var string
     */
    public $tradeNo;

    // 入库单号，可参考格式：年月日+唯一字符
    /**
     * @var string
     */
    public $stockinNo;

    // 入库时间，格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $stockinDate;

    // 时区
    /**
     * @var string
     */
    public $timezone;

    // 仓库代码
    /**
     * @var string
     */
    public $repositoryCode;

    // 客户代码
    /**
     * @var string
     */
    public $customerCode;

    // 保单号,国内起运时投保产生的保单号
    /**
     * @var string
     */
    public $policyNo;

    // 入库货物列表
    /**
     * @var StockinCargo[]
     */
    public $stockinCargos;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tradeNo'           => 'trade_no',
        'stockinNo'         => 'stockin_no',
        'stockinDate'       => 'stockin_date',
        'timezone'          => 'timezone',
        'repositoryCode'    => 'repository_code',
        'customerCode'      => 'customer_code',
        'policyNo'          => 'policy_no',
        'stockinCargos'     => 'stockin_cargos',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('stockinNo', $this->stockinNo, true);
        Model::validateRequired('stockinDate', $this->stockinDate, true);
        Model::validateRequired('timezone', $this->timezone, true);
        Model::validateRequired('repositoryCode', $this->repositoryCode, true);
        Model::validateRequired('customerCode', $this->customerCode, true);
        Model::validateRequired('stockinCargos', $this->stockinCargos, true);
        Model::validatePattern('stockinDate', $this->stockinDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->stockinNo) {
            $res['stockin_no'] = $this->stockinNo;
        }
        if (null !== $this->stockinDate) {
            $res['stockin_date'] = $this->stockinDate;
        }
        if (null !== $this->timezone) {
            $res['timezone'] = $this->timezone;
        }
        if (null !== $this->repositoryCode) {
            $res['repository_code'] = $this->repositoryCode;
        }
        if (null !== $this->customerCode) {
            $res['customer_code'] = $this->customerCode;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->stockinCargos) {
            $res['stockin_cargos'] = [];
            if (null !== $this->stockinCargos && \is_array($this->stockinCargos)) {
                $n = 0;
                foreach ($this->stockinCargos as $item) {
                    $res['stockin_cargos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsuranceStockinRequest
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
        if (isset($map['stockin_no'])) {
            $model->stockinNo = $map['stockin_no'];
        }
        if (isset($map['stockin_date'])) {
            $model->stockinDate = $map['stockin_date'];
        }
        if (isset($map['timezone'])) {
            $model->timezone = $map['timezone'];
        }
        if (isset($map['repository_code'])) {
            $model->repositoryCode = $map['repository_code'];
        }
        if (isset($map['customer_code'])) {
            $model->customerCode = $map['customer_code'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['stockin_cargos'])) {
            if (!empty($map['stockin_cargos'])) {
                $model->stockinCargos = [];
                $n                    = 0;
                foreach ($map['stockin_cargos'] as $item) {
                    $model->stockinCargos[$n++] = null !== $item ? StockinCargo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
