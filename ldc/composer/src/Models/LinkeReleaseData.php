<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LinkeReleaseData extends Model
{
    // Linke release ID
    /**
     * @example ER10046328_GRAY_202000410
     *
     * @var string
     */
    public $releaseId;
    protected $_name = [
        'releaseId' => 'release_id',
    ];

    public function validate()
    {
        Model::validateRequired('releaseId', $this->releaseId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->releaseId) {
            $res['release_id'] = $this->releaseId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LinkeReleaseData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['release_id'])) {
            $model->releaseId = $map['release_id'];
        }

        return $model;
    }
}
