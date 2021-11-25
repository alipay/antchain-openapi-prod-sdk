<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateWorkersWageRequest extends Model
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

    // 项目编号
    /**
     * @var string
     */
    public $projectCode;

    // 身份证号
    /**
     * @var string
     */
    public $idCard;

    // 农民工工资发放信息
    /**
     * @var WorkersWagePayment[]
     */
    public $wageList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectCode'       => 'project_code',
        'idCard'            => 'id_card',
        'wageList'          => 'wage_list',
    ];

    public function validate()
    {
        Model::validateRequired('projectCode', $this->projectCode, true);
        Model::validateRequired('idCard', $this->idCard, true);
        Model::validateRequired('wageList', $this->wageList, true);
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
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->wageList) {
            $res['wage_list'] = [];
            if (null !== $this->wageList && \is_array($this->wageList)) {
                $n = 0;
                foreach ($this->wageList as $item) {
                    $res['wage_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateWorkersWageRequest
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
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }
        if (isset($map['wage_list'])) {
            if (!empty($map['wage_list'])) {
                $model->wageList = [];
                $n               = 0;
                foreach ($map['wage_list'] as $item) {
                    $model->wageList[$n++] = null !== $item ? WorkersWagePayment::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
