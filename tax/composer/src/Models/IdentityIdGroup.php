<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class IdentityIdGroup extends Model
{
    // 44-20230810-9-channel
    /**
     * @example 批次id
     *
     * @var string
     */
    public $groupId;

    // 打标数据返回的url
    /**
     * @example http://aaaa/dddd
     *
     * @var string
     */
    public $fileUrl;

    // 请求id，用于幂等控制
    /**
     * @example f8b63ae0ad8d406ebf60eb8835afeba9
     *
     * @var string
     */
    public $bizUniqueId;
    protected $_name = [
        'groupId'     => 'group_id',
        'fileUrl'     => 'file_url',
        'bizUniqueId' => 'biz_unique_id',
    ];

    public function validate()
    {
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('bizUniqueId', $this->bizUniqueId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->bizUniqueId) {
            $res['biz_unique_id'] = $this->bizUniqueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdentityIdGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['biz_unique_id'])) {
            $model->bizUniqueId = $map['biz_unique_id'];
        }

        return $model;
    }
}
