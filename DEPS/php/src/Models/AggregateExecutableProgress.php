<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\ResourceGroupExecutionProgress;
use AntChain\Deps\Models\BGReleaseExecutionProgress;
use AntChain\Deps\Models\AppServiceExecutionProgressWithRollbackInfo;

class AggregateExecutableProgress extends Model {
    protected $_name = [
        'baseProgress' => 'base_progress',
        'bgReleaseProgresses' => 'bg_release_progresses',
        'appServiceProgresses' => 'app_service_progresses',
        'commonProgresses' => 'common_progresses',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->baseProgress) {
            $res['base_progress'] = null !== $this->baseProgress ? $this->baseProgress->toMap() : null;
        }
        if (null !== $this->bgReleaseProgresses) {
            $res['bg_release_progresses'] = [];
            if(null !== $this->bgReleaseProgresses && is_array($this->bgReleaseProgresses)){
                $n = 0;
                foreach($this->bgReleaseProgresses as $item){
                    $res['bg_release_progresses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->appServiceProgresses) {
            $res['app_service_progresses'] = [];
            if(null !== $this->appServiceProgresses && is_array($this->appServiceProgresses)){
                $n = 0;
                foreach($this->appServiceProgresses as $item){
                    $res['app_service_progresses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->commonProgresses) {
            $res['common_progresses'] = [];
            if(null !== $this->commonProgresses && is_array($this->commonProgresses)){
                $n = 0;
                foreach($this->commonProgresses as $item){
                    $res['common_progresses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AggregateExecutableProgress
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['base_progress'])){
            $model->baseProgress = ResourceGroupExecutionProgress::fromMap($map['base_progress']);
        }
        if(isset($map['bg_release_progresses'])){
            if(!empty($map['bg_release_progresses'])){
                $model->bgReleaseProgresses = [];
                $n = 0;
                foreach($map['bg_release_progresses'] as $item) {
                    $model->bgReleaseProgresses[$n++] = null !== $item ? BGReleaseExecutionProgress::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['app_service_progresses'])){
            if(!empty($map['app_service_progresses'])){
                $model->appServiceProgresses = [];
                $n = 0;
                foreach($map['app_service_progresses'] as $item) {
                    $model->appServiceProgresses[$n++] = null !== $item ? AppServiceExecutionProgressWithRollbackInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['common_progresses'])){
            if(!empty($map['common_progresses'])){
                $model->commonProgresses = [];
                $n = 0;
                foreach($map['common_progresses'] as $item) {
                    $model->commonProgresses[$n++] = null !== $item ? ResourceGroupExecutionProgress::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // base_progress
    /**
     * @example 
     * @var ResourceGroupExecutionProgress
     */
    public $baseProgress;

    // bg_release_progresses
    /**
     * @example 
     * @var BGReleaseExecutionProgress[]
     */
    public $bgReleaseProgresses;

    // app_service_progresses
    /**
     * @example 
     * @var AppServiceExecutionProgressWithRollbackInfo[]
     */
    public $appServiceProgresses;

    // common_progresses
    /**
     * @example 
     * @var ResourceGroupExecutionProgress[]
     */
    public $commonProgresses;

}
