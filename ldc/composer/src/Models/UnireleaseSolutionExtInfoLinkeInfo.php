<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UnireleaseSolutionExtInfoLinkeInfo extends Model
{
    // linke发布窗口
    /**
     * @example ER61640611
     *
     * @var string
     */
    public $releaseWindow;

    // ["EI61640467"]
    /**
     * @example linke迭代列表
     *
     * @var string[]
     */
    public $iterations;

    // 发布接口人列表,要求为域账号
    /**
     * @example ["dengpeng.zdp"]
     *
     * @var string[]
     */
    public $publisher;

    // inke发布Id
    /**
     * @example ER10046328_GRAY_202000410
     *
     * @var string
     */
    public $releaseId;
    protected $_name = [
        'releaseWindow' => 'release_window',
        'iterations'    => 'iterations',
        'publisher'     => 'publisher',
        'releaseId'     => 'release_id',
    ];

    public function validate()
    {
        Model::validateRequired('releaseWindow', $this->releaseWindow, true);
        Model::validateRequired('iterations', $this->iterations, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->releaseWindow) {
            $res['release_window'] = $this->releaseWindow;
        }
        if (null !== $this->iterations) {
            $res['iterations'] = $this->iterations;
        }
        if (null !== $this->publisher) {
            $res['publisher'] = $this->publisher;
        }
        if (null !== $this->releaseId) {
            $res['release_id'] = $this->releaseId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnireleaseSolutionExtInfoLinkeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['release_window'])) {
            $model->releaseWindow = $map['release_window'];
        }
        if (isset($map['iterations'])) {
            if (!empty($map['iterations'])) {
                $model->iterations = $map['iterations'];
            }
        }
        if (isset($map['publisher'])) {
            if (!empty($map['publisher'])) {
                $model->publisher = $map['publisher'];
            }
        }
        if (isset($map['release_id'])) {
            $model->releaseId = $map['release_id'];
        }

        return $model;
    }
}
