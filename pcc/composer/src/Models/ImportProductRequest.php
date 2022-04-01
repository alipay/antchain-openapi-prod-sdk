<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class ImportProductRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 幂等编码，需要唯一
    /**
     * @var string
     */
    public $bizNo;

    // 所属业务线
    /**
     * @var string
     */
    public $businessLine;

    // 所属产品线
    /**
     * @var string
     */
    public $productLine;

    // 产品名称
    /**
     * @var string
     */
    public $name;

    // 产品描述
    /**
     * @var string
     */
    public $description;

    // pd
    /**
     * @var string[]
     */
    public $pds;

    // pd负责人
    /**
     * @var string[]
     */
    public $pdLeaders;

    // 研发负责人
    /**
     * @var string[]
     */
    public $devLeaders;

    // 研发人员
    /**
     * @var string[]
     */
    public $devs;

    // 操作人
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'    => 'auth_token',
        'bizNo'        => 'biz_no',
        'businessLine' => 'business_line',
        'productLine'  => 'product_line',
        'name'         => 'name',
        'description'  => 'description',
        'pds'          => 'pds',
        'pdLeaders'    => 'pd_leaders',
        'devLeaders'   => 'dev_leaders',
        'devs'         => 'devs',
        'operator'     => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('businessLine', $this->businessLine, true);
        Model::validateRequired('productLine', $this->productLine, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('pds', $this->pds, true);
        Model::validateRequired('pdLeaders', $this->pdLeaders, true);
        Model::validateRequired('devLeaders', $this->devLeaders, true);
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->businessLine) {
            $res['business_line'] = $this->businessLine;
        }
        if (null !== $this->productLine) {
            $res['product_line'] = $this->productLine;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->pds) {
            $res['pds'] = $this->pds;
        }
        if (null !== $this->pdLeaders) {
            $res['pd_leaders'] = $this->pdLeaders;
        }
        if (null !== $this->devLeaders) {
            $res['dev_leaders'] = $this->devLeaders;
        }
        if (null !== $this->devs) {
            $res['devs'] = $this->devs;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportProductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['business_line'])) {
            $model->businessLine = $map['business_line'];
        }
        if (isset($map['product_line'])) {
            $model->productLine = $map['product_line'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['pds'])) {
            if (!empty($map['pds'])) {
                $model->pds = $map['pds'];
            }
        }
        if (isset($map['pd_leaders'])) {
            if (!empty($map['pd_leaders'])) {
                $model->pdLeaders = $map['pd_leaders'];
            }
        }
        if (isset($map['dev_leaders'])) {
            if (!empty($map['dev_leaders'])) {
                $model->devLeaders = $map['dev_leaders'];
            }
        }
        if (isset($map['devs'])) {
            if (!empty($map['devs'])) {
                $model->devs = $map['devs'];
            }
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
