<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ComputerCell extends Model {
    protected $_name = [
        'cellId' => 'cell_id',
        'computerId' => 'computer_id',
    ];
    public function validate() {
        Model::validateRequired('cellId', $this->cellId, true);
        Model::validateRequired('computerId', $this->computerId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->computerId) {
            $res['computer_id'] = $this->computerId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ComputerCell
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cell_id'])){
            $model->cellId = $map['cell_id'];
        }
        if(isset($map['computer_id'])){
            $model->computerId = $map['computer_id'];
        }
        return $model;
    }
    // 部署单元唯一标识
    /**
     * @example 
     * @var string
     */
    public $cellId;

    // 计算资源唯一标识
    /**
     * @example 
     * @var string
     */
    public $computerId;

}
