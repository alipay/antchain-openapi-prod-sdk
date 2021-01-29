<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsCmdArg;

class OpsCmd extends Model {
    protected $_name = [
        'args' => 'args',
        'retryInterval' => 'retry_interval',
        'retryTimes' => 'retry_times',
        'templateId' => 'template_id',
        'timeOut' => 'time_out',
    ];
    public function validate() {
        Model::validateRequired('templateId', $this->templateId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->args) {
            $res['args'] = [];
            if(null !== $this->args && is_array($this->args)){
                $n = 0;
                foreach($this->args as $item){
                    $res['args'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->retryInterval) {
            $res['retry_interval'] = $this->retryInterval;
        }
        if (null !== $this->retryTimes) {
            $res['retry_times'] = $this->retryTimes;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->timeOut) {
            $res['time_out'] = $this->timeOut;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsCmd
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['args'])){
            if(!empty($map['args'])){
                $model->args = [];
                $n = 0;
                foreach($map['args'] as $item) {
                    $model->args[$n++] = null !== $item ? OpsCmdArg::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['retry_interval'])){
            $model->retryInterval = $map['retry_interval'];
        }
        if(isset($map['retry_times'])){
            $model->retryTimes = $map['retry_times'];
        }
        if(isset($map['template_id'])){
            $model->templateId = $map['template_id'];
        }
        if(isset($map['time_out'])){
            $model->timeOut = $map['time_out'];
        }
        return $model;
    }
    // 执行指令的参数列表
    /**
     * @example 
     * @var OpsCmdArg[]
     */
    public $args;

    // 失败重试的间隔，单位为秒
    /**
     * @example 
     * @var int
     */
    public $retryInterval;

    // 失败重试次数
    /**
     * @example 
     * @var int
     */
    public $retryTimes;

    // 指令模板ID
    /**
     * @example 
     * @var string
     */
    public $templateId;

    // 单次执行的超时时间，单位为秒
    /**
     * @example 
     * @var int
     */
    public $timeOut;

}
