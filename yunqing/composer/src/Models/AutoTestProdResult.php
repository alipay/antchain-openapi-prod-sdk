<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AutoTestProdResult extends Model
{
    // 测试用例
    /**
     * @example
     *
     * @var AutoTestCase[]
     */
    public $cases;

    // 容器信息
    /**
     * @example afsdafasd
     *
     * @var ContainerInfo[]
     */
    public $containers;

    // 部署单元id
    /**
     * @example default
     *
     * @var string
     */
    public $deployUnit;

    // 产品码
    /**
     * @example ZOOKEEPER
     *
     * @var string
     */
    public $prodCode;

    // 产品测试状态
    /**
     * @example PASSED
     *
     * @var string
     */
    public $status;

    // 测试创建时间
    /**
     * @example 2019-04-28T15:47:27+0800
     *
     * @var string
     */
    public $utcCreate;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcEnd;

    // 测试修改时间
    /**
     * @example 2019-04-28T15:47:27+0800
     *
     * @var string
     */
    public $utcModified;

    // 测试开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcStart;

    // 单元的id
    /**
     * @example 730420181212115238664800000
     *
     * @var string
     */
    public $cellId;
    protected $_name = [
        'cases'       => 'cases',
        'containers'  => 'containers',
        'deployUnit'  => 'deploy_unit',
        'prodCode'    => 'prod_code',
        'status'      => 'status',
        'utcCreate'   => 'utc_create',
        'utcEnd'      => 'utc_end',
        'utcModified' => 'utc_modified',
        'utcStart'    => 'utc_start',
        'cellId'      => 'cell_id',
    ];

    public function validate()
    {
        Model::validateRequired('cases', $this->cases, true);
        Model::validateRequired('containers', $this->containers, true);
        Model::validateRequired('deployUnit', $this->deployUnit, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validateRequired('utcModified', $this->utcModified, true);
        Model::validateRequired('cellId', $this->cellId, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcEnd', $this->utcEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcStart', $this->utcStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cases) {
            $res['cases'] = [];
            if (null !== $this->cases && \is_array($this->cases)) {
                $n = 0;
                foreach ($this->cases as $item) {
                    $res['cases'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->containers) {
            $res['containers'] = [];
            if (null !== $this->containers && \is_array($this->containers)) {
                $n = 0;
                foreach ($this->containers as $item) {
                    $res['containers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deployUnit) {
            $res['deploy_unit'] = $this->deployUnit;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcEnd) {
            $res['utc_end'] = $this->utcEnd;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->utcStart) {
            $res['utc_start'] = $this->utcStart;
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AutoTestProdResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cases'])) {
            if (!empty($map['cases'])) {
                $model->cases = [];
                $n            = 0;
                foreach ($map['cases'] as $item) {
                    $model->cases[$n++] = null !== $item ? AutoTestCase::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['containers'])) {
            if (!empty($map['containers'])) {
                $model->containers = [];
                $n                 = 0;
                foreach ($map['containers'] as $item) {
                    $model->containers[$n++] = null !== $item ? ContainerInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['deploy_unit'])) {
            $model->deployUnit = $map['deploy_unit'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_end'])) {
            $model->utcEnd = $map['utc_end'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['utc_start'])) {
            $model->utcStart = $map['utc_start'];
        }
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }

        return $model;
    }
}
