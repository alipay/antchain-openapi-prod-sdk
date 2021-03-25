<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppServiceExecutionProgress;

class AppServiceExecutionProgressWithRollbackInfo extends Model {
    protected $_name = [
        'progress' => 'progress',
        'rollbackProgress' => 'rollback_progress',
    ];
    public function validate() {
        Model::validateRequired('progress', $this->progress, true);
        Model::validateRequired('rollbackProgress', $this->rollbackProgress, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->progress) {
            $res['progress'] = null !== $this->progress ? $this->progress->toMap() : null;
        }
        if (null !== $this->rollbackProgress) {
            $res['rollback_progress'] = null !== $this->rollbackProgress ? $this->rollbackProgress->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppServiceExecutionProgressWithRollbackInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['progress'])){
            $model->progress = AppServiceExecutionProgress::fromMap($map['progress']);
        }
        if(isset($map['rollback_progress'])){
            $model->rollbackProgress = AppServiceExecutionProgress::fromMap($map['rollback_progress']);
        }
        return $model;
    }
    // progress
    /**
     * @example 
     * @var AppServiceExecutionProgress
     */
    public $progress;

    // rollback_progress
    /**
     * @example 
     * @var AppServiceExecutionProgress
     */
    public $rollbackProgress;

}
