<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class ProjectVO extends Model
{
    // 公益项目ID
    /**
     * @example 1663225167260
     *
     * @var string
     */
    public $id;

    // 创建时间
    /**
     * @example 1663225167260
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 1663225167260
     *
     * @var int
     */
    public $gmtModified;

    // 公益项目名称
    /**
     * @example 公益项目名称
     *
     * @var string
     */
    public $pjName;

    // 机构ID
    /**
     * @example 1663225167260
     *
     * @var string
     */
    public $orgId;

    // 公益方向
    /**
     * @example 1663225167260
     *
     * @var string
     */
    public $publicWelfareDirection;

    // 测试项目:0正式项目(默认),1测试项目
    /**
     * @example 0
     *
     * @var int
     */
    public $testFlag;
    protected $_name = [
        'id'                     => 'id',
        'gmtCreate'              => 'gmt_create',
        'gmtModified'            => 'gmt_modified',
        'pjName'                 => 'pj_name',
        'orgId'                  => 'org_id',
        'publicWelfareDirection' => 'public_welfare_direction',
        'testFlag'               => 'test_flag',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('pjName', $this->pjName, true);
        Model::validateRequired('orgId', $this->orgId, true);
        Model::validateRequired('publicWelfareDirection', $this->publicWelfareDirection, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->pjName) {
            $res['pj_name'] = $this->pjName;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
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
     * @return ProjectVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['pj_name'])) {
            $model->pjName = $map['pj_name'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
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
