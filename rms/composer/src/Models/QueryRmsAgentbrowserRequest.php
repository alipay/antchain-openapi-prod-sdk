<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryRmsAgentbrowserRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_name
    /**
     * @var string
     */
    public $appName;

    // extra_suffixs
    /**
     * @var string[]
     */
    public $extraSuffixs;

    // scan_dirs
    /**
     * @var string[]
     */
    public $scanDirs;

    // prefer_host
    /**
     * @var string
     */
    public $preferHost;

    // tenant_id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'    => 'auth_token',
        'appName'      => 'app_name',
        'extraSuffixs' => 'extra_suffixs',
        'scanDirs'     => 'scan_dirs',
        'preferHost'   => 'prefer_host',
        'tenantId'     => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('extraSuffixs', $this->extraSuffixs, true);
        Model::validateRequired('scanDirs', $this->scanDirs, true);
        Model::validateRequired('preferHost', $this->preferHost, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->extraSuffixs) {
            $res['extra_suffixs'] = $this->extraSuffixs;
        }
        if (null !== $this->scanDirs) {
            $res['scan_dirs'] = $this->scanDirs;
        }
        if (null !== $this->preferHost) {
            $res['prefer_host'] = $this->preferHost;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRmsAgentbrowserRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['extra_suffixs'])) {
            if (!empty($map['extra_suffixs'])) {
                $model->extraSuffixs = $map['extra_suffixs'];
            }
        }
        if (isset($map['scan_dirs'])) {
            if (!empty($map['scan_dirs'])) {
                $model->scanDirs = $map['scan_dirs'];
            }
        }
        if (isset($map['prefer_host'])) {
            $model->preferHost = $map['prefer_host'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
