<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class ProcessDetail extends Model {
    protected $_name = [
        'processName' => 'process_name',
        'processNo' => 'process_no',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->processName) {
            $res['process_name'] = $this->processName;
        }
        if (null !== $this->processNo) {
            $res['process_no'] = $this->processNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ProcessDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['process_name'])){
            $model->processName = $map['process_name'];
        }
        if(isset($map['process_no'])){
            $model->processNo = $map['process_no'];
        }
        return $model;
    }
    // 单元过程名称
    /**
     * @example xxxx
     * @var string
     */
    public $processName;

    // 过程编码
    /**
     * @example xxxx
     * @var string
     */
    public $processNo;

}
