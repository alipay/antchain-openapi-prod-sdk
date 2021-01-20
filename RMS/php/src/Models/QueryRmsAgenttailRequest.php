<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryRmsAgenttailRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenantId' => 'tenant_id',
        'appName' => 'app_name',
        'preferHost' => 'prefer_host',
        'fullPath' => 'full_path',
        'scanDirs' => 'scan_dirs',
        'needBytes' => 'need_bytes',
        'lineBreakStr' => 'line_break_str',
        'extraSuffixs' => 'extra_suffixs',
        'charsetStr' => 'charset_str',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->preferHost) {
            $res['prefer_host'] = $this->preferHost;
        }
        if (null !== $this->fullPath) {
            $res['full_path'] = $this->fullPath;
        }
        if (null !== $this->scanDirs) {
            $res['scan_dirs'] = $this->scanDirs;
        }
        if (null !== $this->needBytes) {
            $res['need_bytes'] = $this->needBytes;
        }
        if (null !== $this->lineBreakStr) {
            $res['line_break_str'] = $this->lineBreakStr;
        }
        if (null !== $this->extraSuffixs) {
            $res['extra_suffixs'] = $this->extraSuffixs;
        }
        if (null !== $this->charsetStr) {
            $res['charset_str'] = $this->charsetStr;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRmsAgenttailRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['prefer_host'])){
            $model->preferHost = $map['prefer_host'];
        }
        if(isset($map['full_path'])){
            $model->fullPath = $map['full_path'];
        }
        if(isset($map['scan_dirs'])){
            if(!empty($map['scan_dirs'])){
                $model->scanDirs = $map['scan_dirs'];
            }
        }
        if(isset($map['need_bytes'])){
            $model->needBytes = $map['need_bytes'];
        }
        if(isset($map['line_break_str'])){
            $model->lineBreakStr = $map['line_break_str'];
        }
        if(isset($map['extra_suffixs'])){
            if(!empty($map['extra_suffixs'])){
                $model->extraSuffixs = $map['extra_suffixs'];
            }
        }
        if(isset($map['charset_str'])){
            $model->charsetStr = $map['charset_str'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // tenant_id
    /**
     * @var string
     */
    public $tenantId;

    // app_name
    /**
     * @var string
     */
    public $appName;

    // prefer_host
    /**
     * @var string
     */
    public $preferHost;

    // full_path
    /**
     * @var string
     */
    public $fullPath;

    // scan_dirs
    /**
     * @var string[]
     */
    public $scanDirs;

    // need_bytes
    /**
     * @var int
     */
    public $needBytes;

    // line_break_str
    /**
     * @var string
     */
    public $lineBreakStr;

    // extra_suffixs
    /**
     * @var string[]
     */
    public $extraSuffixs;

    // charset_str
    /**
     * @var string
     */
    public $charsetStr;

}
