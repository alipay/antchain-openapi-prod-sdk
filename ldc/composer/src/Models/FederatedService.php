<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FederatedService extends Model
{
    // metadata
    /**
     * @example
     *
     * @var ObjectMeta
     */
    public $metadata;

    // status
    /**
     * @example
     *
     * @var FederatedServiceStatus
     */
    public $status;
    protected $_name = [
        'metadata' => 'metadata',
        'status'   => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->metadata) {
            $res['metadata'] = null !== $this->metadata ? $this->metadata->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = null !== $this->status ? $this->status->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FederatedService
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metadata'])) {
            $model->metadata = ObjectMeta::fromMap($map['metadata']);
        }
        if (isset($map['status'])) {
            $model->status = FederatedServiceStatus::fromMap($map['status']);
        }

        return $model;
    }
}
