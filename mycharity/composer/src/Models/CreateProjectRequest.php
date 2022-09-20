<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class CreateProjectRequest extends Model
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

    // 50字符，单平台幂等
    /**
     * @var string
     */
    public $id;

    // 50字符 机构id
    /**
     * @var string
     */
    public $orgId;

    // 100字符 项目名称
    /**
     * @var string
     */
    public $pjName;

    // 64字符  公益领域（系统判断是否维护公益领域字典表，数据库存id）
    /**
     * @var string
     */
    public $publicWelfareDirection;

    // 测试项目说明:0正式项目(未填写默认0),1测试项目
    /**
     * @var int
     */
    public $testFlag;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'id'                     => 'id',
        'orgId'                  => 'org_id',
        'pjName'                 => 'pj_name',
        'publicWelfareDirection' => 'public_welfare_direction',
        'testFlag'               => 'test_flag',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('orgId', $this->orgId, true);
        Model::validateRequired('pjName', $this->pjName, true);
        Model::validateRequired('publicWelfareDirection', $this->publicWelfareDirection, true);
        Model::validateMaxLength('id', $this->id, 50);
        Model::validateMaxLength('orgId', $this->orgId, 50);
        Model::validateMaxLength('pjName', $this->pjName, 100);
        Model::validateMaxLength('publicWelfareDirection', $this->publicWelfareDirection, 64);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->pjName) {
            $res['pj_name'] = $this->pjName;
        }
        if (null !== $this->publicWelfareDirection) {
            $res['public_welfare_direction'] = $this->publicWelfareDirection;
        }
        if (null !== $this->testFlag) {
            $res['test_flag'] = $this->testFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateProjectRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['pj_name'])) {
            $model->pjName = $map['pj_name'];
        }
        if (isset($map['public_welfare_direction'])) {
            $model->publicWelfareDirection = $map['public_welfare_direction'];
        }
        if (isset($map['test_flag'])) {
            $model->testFlag = $map['test_flag'];
        }

        return $model;
    }
}
