<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class HouseBlContainerParam extends Model
{
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @example 暂无
     *
     * @var string
     */
    public $action;

    // 集装箱ID
    /**
     * @example 暂无
     *
     * @var string
     */
    public $containerId;

    // 箱号
    /**
     * @example 暂无
     *
     * @var string
     */
    public $containerNo;
    protected $_name = [
        'action'      => 'action',
        'containerId' => 'container_id',
        'containerNo' => 'container_no',
    ];

    public function validate()
    {
        Model::validateRequired('containerId', $this->containerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->containerId) {
            $res['container_id'] = $this->containerId;
        }
        if (null !== $this->containerNo) {
            $res['container_no'] = $this->containerNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HouseBlContainerParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['container_id'])) {
            $model->containerId = $map['container_id'];
        }
        if (isset($map['container_no'])) {
            $model->containerNo = $map['container_no'];
        }

        return $model;
    }
}
