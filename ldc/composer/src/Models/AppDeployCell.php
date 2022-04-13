<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppDeployCell extends Model
{
    // 单元名字
    /**
     * @example cz00a
     *
     * @var string
     */
    public $cellName;

    // 执行到当前cell的pod总数
    /**
     * @example 10
     *
     * @var int
     */
    public $partition;

    // 当前分组发布的pod数
    /**
     * @example 10
     *
     * @var int
     */
    public $releaseCount;

    // 当前cell发布的pod列表
    /**
     * @example
     *
     * @var PodDetailInfo[]
     */
    public $podList;
    protected $_name = [
        'cellName'     => 'cell_name',
        'partition'    => 'partition',
        'releaseCount' => 'release_count',
        'podList'      => 'pod_list',
    ];

    public function validate()
    {
        Model::validateRequired('cellName', $this->cellName, true);
        Model::validateRequired('partition', $this->partition, true);
        Model::validateRequired('releaseCount', $this->releaseCount, true);
        Model::validateRequired('podList', $this->podList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cellName) {
            $res['cell_name'] = $this->cellName;
        }
        if (null !== $this->partition) {
            $res['partition'] = $this->partition;
        }
        if (null !== $this->releaseCount) {
            $res['release_count'] = $this->releaseCount;
        }
        if (null !== $this->podList) {
            $res['pod_list'] = [];
            if (null !== $this->podList && \is_array($this->podList)) {
                $n = 0;
                foreach ($this->podList as $item) {
                    $res['pod_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppDeployCell
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell_name'])) {
            $model->cellName = $map['cell_name'];
        }
        if (isset($map['partition'])) {
            $model->partition = $map['partition'];
        }
        if (isset($map['release_count'])) {
            $model->releaseCount = $map['release_count'];
        }
        if (isset($map['pod_list'])) {
            if (!empty($map['pod_list'])) {
                $model->podList = [];
                $n              = 0;
                foreach ($map['pod_list'] as $item) {
                    $model->podList[$n++] = null !== $item ? PodDetailInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
